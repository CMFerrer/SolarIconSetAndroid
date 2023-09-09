package com.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TextFormattingGroup

public val TextFormattingGroup.LinkBroken: ImageVector
    get() {
        if (_linkBroken != null) {
            return _linkBroken!!
        }
        _linkBroken = Builder(name = "LinkBroken", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9896f, 3.9909f)
                curveTo(18.4369f, 2.4697f, 16.3083f, 2.4117f, 15.225f, 3.4731f)
                lineTo(11.5249f, 7.098f)
                curveTo(11.229f, 7.3879f, 10.7542f, 7.383f, 10.4643f, 7.0872f)
                curveTo(10.1744f, 6.7913f, 10.1793f, 6.3164f, 10.4752f, 6.0265f)
                lineTo(14.1752f, 2.4016f)
                curveTo(16.0112f, 0.6029f, 19.0889f, 1.0086f, 21.0393f, 2.9194f)
                curveTo(22.9925f, 4.833f, 23.4178f, 7.875f, 21.5679f, 9.6873f)
                lineTo(18.6607f, 12.5355f)
                curveTo(18.3648f, 12.8254f, 17.89f, 12.8205f, 17.6001f, 12.5246f)
                curveTo(17.3102f, 12.2288f, 17.3151f, 11.7539f, 17.611f, 11.464f)
                lineTo(20.5182f, 8.6158f)
                curveTo(21.5876f, 7.5681f, 21.5396f, 5.5094f, 19.9896f, 3.9909f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6241f, 3.5837f)
                curveTo(6.3943f, 3.2391f, 5.9286f, 3.146f, 5.584f, 3.3757f)
                curveTo(5.2393f, 3.6055f, 5.1462f, 4.0711f, 5.376f, 4.4158f)
                lineTo(7.376f, 7.4158f)
                curveTo(7.6058f, 7.7604f, 8.0714f, 7.8536f, 8.416f, 7.6238f)
                curveTo(8.7607f, 7.394f, 8.8538f, 6.9284f, 8.6241f, 6.5837f)
                lineTo(6.6241f, 3.5837f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2372f, 7.2883f)
                curveTo(1.8442f, 7.1573f, 1.4195f, 7.3696f, 1.2885f, 7.7626f)
                curveTo(1.1575f, 8.1556f, 1.3699f, 8.5803f, 1.7629f, 8.7113f)
                lineTo(7.7628f, 10.7113f)
                curveTo(8.1558f, 10.8423f, 8.5806f, 10.6299f, 8.7115f, 10.2369f)
                curveTo(8.8425f, 9.844f, 8.6301f, 9.4192f, 8.2372f, 9.2883f)
                lineTo(2.2372f, 7.2883f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7276f, 12.5058f)
                curveTo(7.007f, 12.2f, 6.9857f, 11.7256f, 6.68f, 11.4462f)
                curveTo(6.3742f, 11.1667f, 5.8998f, 11.188f, 5.6204f, 11.4938f)
                lineTo(4.3595f, 12.8733f)
                curveTo(2.6327f, 14.7626f, 3.0099f, 17.9266f, 4.8639f, 19.955f)
                curveTo(6.729f, 21.9956f, 9.7343f, 22.4592f, 11.5189f, 20.5068f)
                lineTo(15.5536f, 16.0924f)
                curveTo(15.8331f, 15.7866f, 15.8118f, 15.3122f, 15.506f, 15.0328f)
                curveTo(15.2003f, 14.7533f, 14.7259f, 14.7746f, 14.4464f, 15.0804f)
                lineTo(10.4117f, 19.4948f)
                curveTo(9.4108f, 20.5898f, 7.4484f, 20.5593f, 5.971f, 18.943f)
                curveTo(4.4826f, 17.3145f, 4.4081f, 15.0434f, 5.4667f, 13.8852f)
                lineTo(6.7276f, 12.5058f)
                close()
            }
        }
        .build()
        return _linkBroken!!
    }

private var _linkBroken: ImageVector? = null
