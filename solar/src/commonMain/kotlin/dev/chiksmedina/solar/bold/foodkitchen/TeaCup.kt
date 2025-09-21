package dev.chiksmedina.solar.bold.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.TeaCup: ImageVector
    get() {
        if (_teaCup != null) {
            return _teaCup!!
        }
        _teaCup = Builder(
            name = "TeaCup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.2509f, 11.8809f)
                curveTo(2.2404f, 12.057f, 2.2654f, 12.2706f, 2.3153f, 12.6978f)
                lineTo(2.716f, 16.1258f)
                curveTo(2.8968f, 17.6729f, 3.7235f, 19.0714f, 4.9918f, 19.9757f)
                curveTo(5.9263f, 20.6419f, 7.0454f, 21.0f, 8.193f, 21.0f)
                horizontalLineTo(11.8069f)
                curveTo(12.9546f, 21.0f, 14.0736f, 20.6419f, 15.0081f, 19.9757f)
                curveTo(15.8116f, 19.4028f, 16.4378f, 18.6317f, 16.8349f, 17.75f)
                horizontalLineTo(19.0f)
                curveTo(21.0711f, 17.75f, 22.75f, 16.0711f, 22.75f, 14.0f)
                curveTo(22.75f, 11.9289f, 21.0711f, 10.25f, 19.0f, 10.25f)
                horizontalLineTo(16.7212f)
                curveTo(16.5325f, 10.1455f, 16.3244f, 10.0703f, 16.1027f, 10.0309f)
                curveTo(15.929f, 10.0f, 15.7139f, 10.0f, 15.2838f, 10.0f)
                horizontalLineTo(4.7161f)
                curveTo(4.286f, 10.0f, 4.0709f, 10.0f, 3.8972f, 10.0309f)
                curveTo(2.9868f, 10.1928f, 2.306f, 10.9577f, 2.2509f, 11.8809f)
                close()
                moveTo(17.7369f, 11.75f)
                curveTo(17.7424f, 11.7932f, 17.7464f, 11.8369f, 17.749f, 11.8809f)
                curveTo(17.7595f, 12.057f, 17.7346f, 12.2706f, 17.6847f, 12.6977f)
                lineTo(17.284f, 16.1258f)
                curveTo(17.2791f, 16.1673f, 17.2738f, 16.2087f, 17.268f, 16.25f)
                horizontalLineTo(19.0f)
                curveTo(20.2426f, 16.25f, 21.25f, 15.2426f, 21.25f, 14.0f)
                curveTo(21.25f, 12.7574f, 20.2426f, 11.75f, 19.0f, 11.75f)
                horizontalLineTo(17.7369f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.5305f, 1.4697f)
                curveTo(10.8234f, 1.7626f, 10.8234f, 2.2374f, 10.5305f, 2.5303f)
                curveTo(10.2711f, 2.7897f, 10.2711f, 3.2103f, 10.5305f, 3.4697f)
                curveTo(11.3757f, 4.3148f, 11.3757f, 5.6852f, 10.5305f, 6.5303f)
                curveTo(10.2376f, 6.8232f, 9.7627f, 6.8232f, 9.4698f, 6.5303f)
                curveTo(9.1769f, 6.2374f, 9.1769f, 5.7626f, 9.4698f, 5.4697f)
                curveTo(9.7292f, 5.2103f, 9.7292f, 4.7897f, 9.4698f, 4.5303f)
                curveTo(8.6246f, 3.6851f, 8.6246f, 2.3149f, 9.4698f, 1.4697f)
                curveTo(9.7627f, 1.1768f, 10.2376f, 1.1768f, 10.5305f, 1.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.0303f, 2.9697f)
                curveTo(6.3232f, 3.2626f, 6.3232f, 3.7374f, 6.0303f, 4.0303f)
                lineTo(5.9142f, 4.1465f)
                curveTo(5.671f, 4.3897f, 5.6436f, 4.7748f, 5.85f, 5.05f)
                curveTo(6.5043f, 5.9224f, 6.4175f, 7.1431f, 5.6465f, 7.9142f)
                lineTo(5.5303f, 8.0303f)
                curveTo(5.2374f, 8.3232f, 4.7626f, 8.3232f, 4.4697f, 8.0303f)
                curveTo(4.1768f, 7.7374f, 4.1768f, 7.2626f, 4.4697f, 6.9697f)
                lineTo(4.5858f, 6.8535f)
                curveTo(4.829f, 6.6103f, 4.8564f, 6.2252f, 4.65f, 5.95f)
                curveTo(3.9957f, 5.0776f, 4.0825f, 3.8569f, 4.8535f, 3.0858f)
                lineTo(4.9697f, 2.9697f)
                curveTo(5.2626f, 2.6768f, 5.7374f, 2.6768f, 6.0303f, 2.9697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.5303f, 2.9697f)
                curveTo(15.8232f, 3.2626f, 15.8232f, 3.7374f, 15.5303f, 4.0303f)
                lineTo(15.4142f, 4.1465f)
                curveTo(15.171f, 4.3897f, 15.1436f, 4.7748f, 15.35f, 5.05f)
                curveTo(16.0043f, 5.9224f, 15.9175f, 7.1431f, 15.1464f, 7.9142f)
                lineTo(15.0303f, 8.0303f)
                curveTo(14.7374f, 8.3232f, 14.2626f, 8.3232f, 13.9697f, 8.0303f)
                curveTo(13.6768f, 7.7374f, 13.6768f, 7.2626f, 13.9697f, 6.9697f)
                lineTo(14.0858f, 6.8535f)
                curveTo(14.329f, 6.6103f, 14.3564f, 6.2252f, 14.15f, 5.95f)
                curveTo(13.4957f, 5.0776f, 13.5825f, 3.8569f, 14.3536f, 3.0858f)
                lineTo(14.4697f, 2.9697f)
                curveTo(14.7626f, 2.6768f, 15.2374f, 2.6768f, 15.5303f, 2.9697f)
                close()
            }
        }
            .build()
        return _teaCup!!
    }

private var _teaCup: ImageVector? = null
