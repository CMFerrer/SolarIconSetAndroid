package dev.chiksmedina.solar.lineduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.MessagesConversationGroup

val MessagesConversationGroup.PenNewRound: ImageVector
    get() {
        if (_penNewRound != null) {
            return _penNewRound!!
        }
        _penNewRound = Builder(
            name = "PenNewRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.6522f, 3.4551f)
                curveTo(16.6522f, 3.4551f, 16.7333f, 4.8338f, 17.9499f, 6.0503f)
                curveTo(19.1664f, 7.2669f, 20.5451f, 7.348f, 20.5451f, 7.348f)
                moveTo(10.1002f, 15.5876f)
                lineTo(8.4126f, 13.9f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.652f, 3.4551f)
                lineTo(17.3009f, 2.8062f)
                curveTo(18.3759f, 1.7313f, 20.1188f, 1.7313f, 21.1938f, 2.8062f)
                curveTo(22.2687f, 3.8812f, 22.2687f, 5.6241f, 21.1938f, 6.6991f)
                lineTo(20.5449f, 7.3479f)
                lineTo(14.5801f, 13.3128f)
                curveTo(14.1761f, 13.7168f, 13.9741f, 13.9188f, 13.7513f, 14.0926f)
                curveTo(13.4886f, 14.2975f, 13.2043f, 14.4732f, 12.9035f, 14.6166f)
                curveTo(12.6485f, 14.7381f, 12.3775f, 14.8284f, 11.8354f, 15.0091f)
                lineTo(10.1f, 15.5876f)
                lineTo(8.9771f, 15.9619f)
                curveTo(8.7104f, 16.0508f, 8.4163f, 15.9814f, 8.2174f, 15.7826f)
                curveTo(8.0186f, 15.5837f, 7.9492f, 15.2897f, 8.0381f, 15.0229f)
                lineTo(8.4124f, 13.9f)
                lineTo(8.9909f, 12.1646f)
                curveTo(9.1716f, 11.6225f, 9.2619f, 11.3515f, 9.3834f, 11.0965f)
                curveTo(9.5268f, 10.7957f, 9.7025f, 10.5114f, 9.9074f, 10.2487f)
                curveTo(10.0812f, 10.0259f, 10.2832f, 9.8239f, 10.6872f, 9.4199f)
                lineTo(16.652f, 3.4551f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
            }
        }
            .build()
        return _penNewRound!!
    }

private var _penNewRound: ImageVector? = null
