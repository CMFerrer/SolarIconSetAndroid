package com.chiksmedina.solar.broken.messagesconversation

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
import com.chiksmedina.solar.broken.MessagesConversationGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.652f, 3.4551f)
                lineTo(17.3009f, 2.8062f)
                curveTo(18.3759f, 1.7313f, 20.1188f, 1.7313f, 21.1938f, 2.8062f)
                curveTo(22.2687f, 3.8812f, 22.2687f, 5.6241f, 21.1938f, 6.6991f)
                lineTo(20.5449f, 7.3479f)
                moveTo(16.652f, 3.4551f)
                curveTo(16.652f, 3.4551f, 16.7331f, 4.8338f, 17.9497f, 6.0503f)
                curveTo(19.1662f, 7.2668f, 20.5449f, 7.3479f, 20.5449f, 7.3479f)
                moveTo(16.652f, 3.4551f)
                lineTo(10.6872f, 9.4199f)
                curveTo(10.2832f, 9.8239f, 10.0812f, 10.0259f, 9.9074f, 10.2487f)
                curveTo(9.7025f, 10.5114f, 9.5268f, 10.7957f, 9.3834f, 11.0965f)
                curveTo(9.2619f, 11.3515f, 9.1716f, 11.6225f, 8.9909f, 12.1646f)
                lineTo(8.4124f, 13.9f)
                moveTo(20.5449f, 7.3479f)
                lineTo(17.5625f, 10.3304f)
                moveTo(14.5801f, 13.3128f)
                curveTo(14.1761f, 13.7168f, 13.9741f, 13.9188f, 13.7513f, 14.0926f)
                curveTo(13.4886f, 14.2975f, 13.2043f, 14.4732f, 12.9035f, 14.6166f)
                curveTo(12.6485f, 14.7381f, 12.3775f, 14.8284f, 11.8354f, 15.0091f)
                lineTo(10.1f, 15.5876f)
                moveTo(10.1f, 15.5876f)
                lineTo(8.9771f, 15.9619f)
                curveTo(8.7104f, 16.0508f, 8.4163f, 15.9814f, 8.2174f, 15.7826f)
                curveTo(8.0186f, 15.5837f, 7.9492f, 15.2897f, 8.0381f, 15.0229f)
                lineTo(8.4124f, 13.9f)
                moveTo(10.1f, 15.5876f)
                lineTo(8.4124f, 13.9f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.75f, 12.0f)
                curveTo(22.75f, 11.5858f, 22.4142f, 11.25f, 22.0f, 11.25f)
                curveTo(21.5858f, 11.25f, 21.25f, 11.5858f, 21.25f, 12.0f)
                horizontalLineTo(22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(12.4142f, 2.75f, 12.75f, 2.4142f, 12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(7.3755f, 20.013f)
                curveTo(7.017f, 19.8056f, 6.5582f, 19.9281f, 6.3508f, 20.2866f)
                curveTo(6.1434f, 20.6452f, 6.2659f, 21.104f, 6.6245f, 21.3114f)
                lineTo(7.3755f, 20.013f)
                close()
                moveTo(2.6886f, 17.3755f)
                curveTo(2.896f, 17.7341f, 3.3548f, 17.8566f, 3.7134f, 17.6492f)
                curveTo(4.0719f, 17.4418f, 4.1944f, 16.983f, 3.987f, 16.6245f)
                lineTo(2.6886f, 17.3755f)
                close()
                moveTo(21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                verticalLineTo(22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                horizontalLineTo(2.75f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(6.6245f, 21.3114f)
                curveTo(8.2064f, 22.2265f, 10.0432f, 22.75f, 12.0f, 22.75f)
                verticalLineTo(21.25f)
                curveTo(10.3139f, 21.25f, 8.7353f, 20.7996f, 7.3755f, 20.013f)
                lineTo(6.6245f, 21.3114f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 13.9568f, 1.7735f, 15.7936f, 2.6886f, 17.3755f)
                lineTo(3.987f, 16.6245f)
                curveTo(3.2004f, 15.2647f, 2.75f, 13.6861f, 2.75f, 12.0f)
                horizontalLineTo(1.25f)
                close()
            }
        }
            .build()
        return _penNewRound!!
    }

private var _penNewRound: ImageVector? = null
