package dev.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.CalculatorMinimalistic: ImageVector
    get() {
        if (_calculatorMinimalistic != null) {
            return _calculatorMinimalistic!!
        }
        _calculatorMinimalistic = Builder(
            name = "CalculatorMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.0f, 5.75f)
                curveTo(8.4142f, 5.75f, 8.75f, 6.0858f, 8.75f, 6.5f)
                lineTo(8.75f, 7.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 7.75f, 10.75f, 8.0858f, 10.75f, 8.5f)
                curveTo(10.75f, 8.9142f, 10.4142f, 9.25f, 10.0f, 9.25f)
                horizontalLineTo(8.75f)
                verticalLineTo(10.5f)
                curveTo(8.75f, 10.9142f, 8.4142f, 11.25f, 8.0f, 11.25f)
                curveTo(7.5858f, 11.25f, 7.25f, 10.9142f, 7.25f, 10.5f)
                lineTo(7.25f, 9.25f)
                lineTo(6.0f, 9.25f)
                curveTo(5.5858f, 9.25f, 5.25f, 8.9142f, 5.25f, 8.5f)
                curveTo(5.25f, 8.0858f, 5.5858f, 7.75f, 6.0f, 7.75f)
                horizontalLineTo(7.25f)
                lineTo(7.25f, 6.5f)
                curveTo(7.25f, 6.0858f, 7.5858f, 5.75f, 8.0f, 5.75f)
                close()
                moveTo(13.25f, 8.5f)
                curveTo(13.25f, 8.0858f, 13.5858f, 7.75f, 14.0f, 7.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 7.75f, 18.75f, 8.0858f, 18.75f, 8.5f)
                curveTo(18.75f, 8.9142f, 18.4142f, 9.25f, 18.0f, 9.25f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 9.25f, 13.25f, 8.9142f, 13.25f, 8.5f)
                close()
                moveTo(13.25f, 14.5f)
                curveTo(13.25f, 14.0858f, 13.5858f, 13.75f, 14.0f, 13.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 13.75f, 18.75f, 14.0858f, 18.75f, 14.5f)
                curveTo(18.75f, 14.9142f, 18.4142f, 15.25f, 18.0f, 15.25f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 15.25f, 13.25f, 14.9142f, 13.25f, 14.5f)
                close()
                moveTo(5.9697f, 13.9697f)
                curveTo(6.2626f, 13.6768f, 6.7374f, 13.6768f, 7.0303f, 13.9697f)
                lineTo(8.0f, 14.9394f)
                lineTo(8.9697f, 13.9697f)
                curveTo(9.2626f, 13.6768f, 9.7374f, 13.6768f, 10.0303f, 13.9697f)
                curveTo(10.3232f, 14.2626f, 10.3232f, 14.7375f, 10.0303f, 15.0304f)
                lineTo(9.0607f, 16.0f)
                lineTo(10.0303f, 16.9697f)
                curveTo(10.3232f, 17.2626f, 10.3232f, 17.7374f, 10.0303f, 18.0303f)
                curveTo(9.7374f, 18.3232f, 9.2626f, 18.3232f, 8.9697f, 18.0303f)
                lineTo(8.0f, 17.0607f)
                lineTo(7.0303f, 18.0304f)
                curveTo(6.7375f, 18.3232f, 6.2626f, 18.3232f, 5.9697f, 18.0304f)
                curveTo(5.6768f, 17.7375f, 5.6768f, 17.2626f, 5.9697f, 16.9697f)
                lineTo(6.9394f, 16.0f)
                lineTo(5.9697f, 15.0304f)
                curveTo(5.6768f, 14.7375f, 5.6768f, 14.2626f, 5.9697f, 13.9697f)
                close()
                moveTo(13.25f, 17.5f)
                curveTo(13.25f, 17.0858f, 13.5858f, 16.75f, 14.0f, 16.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 16.75f, 18.75f, 17.0858f, 18.75f, 17.5f)
                curveTo(18.75f, 17.9142f, 18.4142f, 18.25f, 18.0f, 18.25f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 18.25f, 13.25f, 17.9142f, 13.25f, 17.5f)
                close()
            }
        }
            .build()
        return _calculatorMinimalistic!!
    }

private var _calculatorMinimalistic: ImageVector? = null
