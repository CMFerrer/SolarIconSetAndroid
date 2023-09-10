package com.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(
            name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.0828f, 19.0632f)
                curveTo(12.6389f, 19.5072f, 12.2399f, 19.9062f, 11.8725f, 20.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 20.25f, 21.75f, 20.5858f, 21.75f, 21.0f)
                curveTo(21.75f, 21.4142f, 21.4142f, 21.75f, 21.0f, 21.75f)
                horizontalLineTo(9.0f)
                curveTo(8.9817f, 21.75f, 8.9635f, 21.7493f, 8.9455f, 21.748f)
                curveTo(8.2416f, 21.7211f, 7.6444f, 21.4169f, 7.0586f, 20.97f)
                curveTo(6.4712f, 20.5218f, 5.8154f, 19.866f, 5.0127f, 19.0632f)
                lineTo(4.9367f, 18.9873f)
                curveTo(4.134f, 18.1846f, 3.4781f, 17.5288f, 3.03f, 16.9414f)
                curveTo(2.5616f, 16.3274f, 2.25f, 15.701f, 2.25f, 14.9522f)
                curveTo(2.25f, 14.2035f, 2.5616f, 13.577f, 3.03f, 12.9631f)
                curveTo(3.4782f, 12.3757f, 4.134f, 11.7199f, 4.9367f, 10.9172f)
                lineTo(10.9172f, 4.9367f)
                curveTo(11.7199f, 4.134f, 12.3757f, 3.4781f, 12.9631f, 3.03f)
                curveTo(13.577f, 2.5616f, 14.2035f, 2.25f, 14.9522f, 2.25f)
                curveTo(15.701f, 2.25f, 16.3274f, 2.5616f, 16.9414f, 3.03f)
                curveTo(17.5288f, 3.4782f, 18.1846f, 4.134f, 18.9873f, 4.9367f)
                lineTo(19.0632f, 5.0127f)
                curveTo(19.866f, 5.8154f, 20.5218f, 6.4712f, 20.97f, 7.0586f)
                curveTo(21.4384f, 7.6726f, 21.75f, 8.299f, 21.75f, 9.0478f)
                curveTo(21.75f, 9.7965f, 21.4384f, 10.423f, 20.97f, 11.0369f)
                curveTo(20.5219f, 11.6243f, 19.866f, 12.2801f, 19.0633f, 13.0827f)
                lineTo(13.0828f, 19.0632f)
                close()
                moveTo(11.9399f, 6.0354f)
                curveTo(12.7899f, 5.1854f, 13.3752f, 4.6024f, 13.873f, 4.2225f)
                curveTo(14.3535f, 3.8559f, 14.6633f, 3.75f, 14.9522f, 3.75f)
                curveTo(15.2411f, 3.75f, 15.551f, 3.8559f, 16.0315f, 4.2225f)
                curveTo(16.5293f, 4.6024f, 17.1146f, 5.1854f, 17.9646f, 6.0354f)
                curveTo(18.8146f, 6.8854f, 19.3977f, 7.4707f, 19.7775f, 7.9685f)
                curveTo(20.1441f, 8.449f, 20.25f, 8.7589f, 20.25f, 9.0478f)
                curveTo(20.25f, 9.3366f, 20.1441f, 9.6465f, 19.7775f, 10.127f)
                curveTo(19.3977f, 10.6248f, 18.8146f, 11.2101f, 17.9646f, 12.0601f)
                lineTo(13.7713f, 16.2534f)
                lineTo(7.7466f, 10.2287f)
                lineTo(11.9399f, 6.0354f)
                close()
                moveTo(9.0478f, 20.25f)
                curveTo(9.3366f, 20.25f, 9.6465f, 20.1441f, 10.127f, 19.7775f)
                curveTo(10.6248f, 19.3977f, 11.2101f, 18.8146f, 12.0601f, 17.9646f)
                lineTo(12.7107f, 17.314f)
                lineTo(6.686f, 11.2893f)
                lineTo(6.0354f, 11.9399f)
                curveTo(5.1854f, 12.7899f, 4.6024f, 13.3752f, 4.2225f, 13.873f)
                curveTo(3.8559f, 14.3535f, 3.75f, 14.6633f, 3.75f, 14.9522f)
                curveTo(3.75f, 15.2411f, 3.8559f, 15.551f, 4.2225f, 16.0315f)
                curveTo(4.6024f, 16.5293f, 5.1854f, 17.1146f, 6.0354f, 17.9646f)
                curveTo(6.8854f, 18.8146f, 7.4707f, 19.3977f, 7.9685f, 19.7775f)
                curveTo(8.449f, 20.1441f, 8.7589f, 20.25f, 9.0478f, 20.25f)
                close()
            }
        }
            .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
