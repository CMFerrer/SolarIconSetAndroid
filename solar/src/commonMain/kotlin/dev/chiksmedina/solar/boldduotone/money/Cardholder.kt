package dev.chiksmedina.solar.boldduotone.money

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
import dev.chiksmedina.solar.boldduotone.MoneyGroup

val MoneyGroup.Cardholder: ImageVector
    get() {
        if (_cardholder != null) {
            return _cardholder!!
        }
        _cardholder = Builder(
            name = "Cardholder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
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
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 15.25f)
                curveTo(7.5858f, 15.25f, 7.25f, 15.5858f, 7.25f, 16.0f)
                curveTo(7.25f, 16.4142f, 7.5858f, 16.75f, 8.0f, 16.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 16.75f, 16.75f, 16.4142f, 16.75f, 16.0f)
                curveTo(16.75f, 15.5858f, 16.4142f, 15.25f, 16.0f, 15.25f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.0f, 10.25f)
                horizontalLineTo(7.0f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 10.25f, 4.25f, 10.5858f, 4.25f, 11.0f)
                curveTo(4.25f, 11.4142f, 4.5858f, 11.75f, 5.0f, 11.75f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 11.75f, 19.75f, 11.4142f, 19.75f, 11.0f)
                curveTo(19.75f, 10.5858f, 19.4142f, 10.25f, 19.0f, 10.25f)
                horizontalLineTo(17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 6.0f)
                horizontalLineTo(11.0f)
                curveTo(9.1144f, 6.0f, 8.1716f, 6.0f, 7.5858f, 6.5858f)
                curveTo(7.0f, 7.1716f, 7.0f, 8.1144f, 7.0f, 10.0f)
                verticalLineTo(10.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 8.1144f, 17.0f, 7.1716f, 16.4142f, 6.5858f)
                curveTo(15.8284f, 6.0f, 14.8856f, 6.0f, 13.0f, 6.0f)
                close()
            }
        }
            .build()
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
