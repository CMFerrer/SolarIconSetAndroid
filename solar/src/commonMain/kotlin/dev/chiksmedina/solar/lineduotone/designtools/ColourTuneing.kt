package dev.chiksmedina.solar.lineduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.DesignToolsGroup

val DesignToolsGroup.ColourTuneing: ImageVector
    get() {
        if (_colourTuneing != null) {
            return _colourTuneing!!
        }
        _colourTuneing = Builder(
            name = "ColourTuneing", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(9.5f)
                moveTo(22.0f, 12.0f)
                horizontalLineTo(14.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0002f, 15.6844f)
                curveTo(20.0002f, 19.0002f, 17.7345f, 22.0002f, 16.0002f, 22.0002f)
                curveTo(13.7315f, 22.0002f, 12.0723f, 18.8423f, 12.0723f, 12.0002f)
                curveTo(12.0723f, 5.1581f, 10.4128f, 2.0f, 8.144f, 2.0f)
                curveTo(6.4098f, 2.0f, 4.144f, 5.0f, 4.144f, 8.3158f)
            }
        }
            .build()
        return _colourTuneing!!
    }

private var _colourTuneing: ImageVector? = null
