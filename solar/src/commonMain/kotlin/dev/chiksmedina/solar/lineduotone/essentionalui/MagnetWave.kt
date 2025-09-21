package dev.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.MagnetWave: ImageVector
    get() {
        if (_magnetWave != null) {
            return _magnetWave!!
        }
        _magnetWave = Builder(
            name = "MagnetWave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 18.0f)
                verticalLineTo(19.5f)
                curveTo(18.0f, 20.3284f, 17.3284f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(14.4444f)
                horizontalLineTo(11.0f)
                curveTo(6.0294f, 21.0f, 2.0f, 16.9706f, 2.0f, 12.0f)
                curveTo(2.0f, 7.0294f, 6.0294f, 3.0f, 11.0f, 3.0f)
                horizontalLineTo(14.4444f)
                horizontalLineTo(16.5f)
                curveTo(17.3284f, 3.0f, 18.0f, 3.6716f, 18.0f, 4.5f)
                verticalLineTo(6.0f)
                curveTo(18.0f, 6.8284f, 17.3284f, 7.5f, 16.5f, 7.5f)
                horizontalLineTo(14.4444f)
                horizontalLineTo(10.9444f)
                curveTo(8.4592f, 7.5f, 6.4444f, 9.5147f, 6.4444f, 12.0f)
                curveTo(6.4444f, 14.4853f, 8.4592f, 16.5f, 10.9444f, 16.5f)
                horizontalLineTo(14.4444f)
                horizontalLineTo(16.5f)
                curveTo(17.3284f, 16.5f, 18.0f, 17.1716f, 18.0f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.4443f, 3.0f)
                verticalLineTo(7.5f)
                moveTo(14.4443f, 16.5f)
                verticalLineTo(21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.5f, 6.0f)
                curveTo(21.5f, 6.0f, 23.0f, 7.8f, 23.0f, 12.0f)
                curveTo(23.0f, 16.2f, 21.5f, 18.0f, 21.5f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5f, 9.0f)
                curveTo(19.5f, 9.0f, 20.0f, 9.9f, 20.0f, 12.0f)
                curveTo(20.0f, 14.1f, 19.5f, 15.0f, 19.5f, 15.0f)
            }
        }
            .build()
        return _magnetWave!!
    }

private var _magnetWave: ImageVector? = null
