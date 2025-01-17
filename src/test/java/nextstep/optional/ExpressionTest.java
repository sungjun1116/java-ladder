package nextstep.optional;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;


class ExpressionTest {

    @Test
    void of() {
        assertThat(Expression.of("+")).isSameAs(Expression.PLUS);
    }

    @Test
    void notValidExpression() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> Expression.of("&"));
    }
}
