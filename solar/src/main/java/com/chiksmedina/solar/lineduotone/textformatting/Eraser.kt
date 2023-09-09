package com.chiksmedina.solar.lineduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.TextFormattingGroup

public val TextFormattingGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5051f, 11.4096f)
                lineTo(6.0354f, 11.9399f)
                lineTo(6.0354f, 11.9399f)
                lineTo(5.5051f, 11.4096f)
                close()
                moveTo(3.0f, 14.9522f)
                lineTo(2.25f, 14.9522f)
                lineTo(3.0f, 14.9522f)
                close()
                moveTo(9.0478f, 21.0f)
                verticalLineTo(21.75f)
                verticalLineTo(21.0f)
                close()
                moveTo(11.4096f, 5.5051f)
                lineTo(10.8792f, 4.9747f)
                lineTo(10.8792f, 4.9747f)
                lineTo(11.4096f, 5.5051f)
                close()
                moveTo(17.9646f, 12.0601f)
                lineTo(12.0601f, 17.9646f)
                lineTo(13.1208f, 19.0253f)
                lineTo(19.0253f, 13.1208f)
                lineTo(17.9646f, 12.0601f)
                close()
                moveTo(6.0354f, 11.9399f)
                lineTo(11.9399f, 6.0354f)
                lineTo(10.8792f, 4.9747f)
                lineTo(4.9747f, 10.8792f)
                lineTo(6.0354f, 11.9399f)
                close()
                moveTo(6.0354f, 17.9646f)
                curveTo(5.1854f, 17.1146f, 4.6024f, 16.5293f, 4.2225f, 16.0315f)
                curveTo(3.8559f, 15.551f, 3.75f, 15.2411f, 3.75f, 14.9522f)
                lineTo(2.25f, 14.9522f)
                curveTo(2.25f, 15.701f, 2.5616f, 16.3274f, 3.03f, 16.9414f)
                curveTo(3.4852f, 17.538f, 4.1547f, 18.2052f, 4.9747f, 19.0253f)
                lineTo(6.0354f, 17.9646f)
                close()
                moveTo(4.9747f, 10.8792f)
                curveTo(4.1547f, 11.6992f, 3.4852f, 12.3665f, 3.03f, 12.9631f)
                curveTo(2.5616f, 13.577f, 2.25f, 14.2035f, 2.25f, 14.9522f)
                horizontalLineTo(3.75f)
                curveTo(3.75f, 14.6633f, 3.8559f, 14.3535f, 4.2225f, 13.873f)
                curveTo(4.6024f, 13.3752f, 5.1854f, 12.7899f, 6.0354f, 11.9399f)
                lineTo(4.9747f, 10.8792f)
                close()
                moveTo(12.0601f, 17.9646f)
                curveTo(11.2101f, 18.8146f, 10.6248f, 19.3977f, 10.127f, 19.7775f)
                curveTo(9.6465f, 20.1441f, 9.3366f, 20.25f, 9.0478f, 20.25f)
                verticalLineTo(21.75f)
                curveTo(9.7965f, 21.75f, 10.423f, 21.4384f, 11.0369f, 20.97f)
                curveTo(11.6335f, 20.5148f, 12.3008f, 19.8453f, 13.1208f, 19.0253f)
                lineTo(12.0601f, 17.9646f)
                close()
                moveTo(4.9747f, 19.0253f)
                curveTo(5.7948f, 19.8453f, 6.462f, 20.5148f, 7.0586f, 20.97f)
                curveTo(7.6726f, 21.4384f, 8.299f, 21.75f, 9.0478f, 21.75f)
                verticalLineTo(20.25f)
                curveTo(8.7589f, 20.25f, 8.449f, 20.1441f, 7.9685f, 19.7775f)
                curveTo(7.4707f, 19.3977f, 6.8854f, 18.8146f, 6.0354f, 17.9646f)
                lineTo(4.9747f, 19.0253f)
                close()
                moveTo(17.9646f, 6.0354f)
                curveTo(18.8146f, 6.8854f, 19.3977f, 7.4707f, 19.7775f, 7.9685f)
                curveTo(20.1441f, 8.449f, 20.25f, 8.7589f, 20.25f, 9.0478f)
                horizontalLineTo(21.75f)
                curveTo(21.75f, 8.299f, 21.4384f, 7.6726f, 20.97f, 7.0586f)
                curveTo(20.5148f, 6.462f, 19.8453f, 5.7948f, 19.0253f, 4.9747f)
                lineTo(17.9646f, 6.0354f)
                close()
                moveTo(19.0253f, 13.1208f)
                curveTo(19.8453f, 12.3008f, 20.5148f, 11.6335f, 20.97f, 11.0369f)
                curveTo(21.4384f, 10.423f, 21.75f, 9.7965f, 21.75f, 9.0478f)
                horizontalLineTo(20.25f)
                curveTo(20.25f, 9.3366f, 20.1441f, 9.6465f, 19.7775f, 10.127f)
                curveTo(19.3977f, 10.6248f, 18.8146f, 11.2101f, 17.9646f, 12.0601f)
                lineTo(19.0253f, 13.1208f)
                close()
                moveTo(19.0253f, 4.9747f)
                curveTo(18.2052f, 4.1547f, 17.538f, 3.4852f, 16.9414f, 3.03f)
                curveTo(16.3274f, 2.5616f, 15.701f, 2.25f, 14.9522f, 2.25f)
                verticalLineTo(3.75f)
                curveTo(15.2411f, 3.75f, 15.551f, 3.8559f, 16.0315f, 4.2225f)
                curveTo(16.5293f, 4.6024f, 17.1146f, 5.1854f, 17.9646f, 6.0354f)
                lineTo(19.0253f, 4.9747f)
                close()
                moveTo(11.9399f, 6.0354f)
                curveTo(12.7899f, 5.1854f, 13.3752f, 4.6024f, 13.873f, 4.2225f)
                curveTo(14.3535f, 3.8559f, 14.6633f, 3.75f, 14.9522f, 3.75f)
                verticalLineTo(2.25f)
                curveTo(14.2035f, 2.25f, 13.577f, 2.5616f, 12.9631f, 3.03f)
                curveTo(12.3665f, 3.4852f, 11.6992f, 4.1547f, 10.8792f, 4.9747f)
                lineTo(11.9399f, 6.0354f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2411f, 17.8442f)
                curveTo(13.534f, 18.1371f, 14.0089f, 18.1371f, 14.3018f, 17.8442f)
                curveTo(14.5946f, 17.5513f, 14.5946f, 17.0765f, 14.3018f, 16.7836f)
                lineTo(13.2411f, 17.8442f)
                close()
                moveTo(7.2164f, 9.6982f)
                curveTo(6.9235f, 9.4053f, 6.4486f, 9.4053f, 6.1557f, 9.6982f)
                curveTo(5.8628f, 9.9911f, 5.8628f, 10.466f, 6.1557f, 10.7588f)
                lineTo(7.2164f, 9.6982f)
                close()
                moveTo(14.3018f, 16.7836f)
                lineTo(7.2164f, 9.6982f)
                lineTo(6.1557f, 10.7588f)
                lineTo(13.2411f, 17.8442f)
                lineTo(14.3018f, 16.7836f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 21.0f)
                horizontalLineTo(21.0f)
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
