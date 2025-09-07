package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.9265f, 14.3018f)
                curveTo(14.1716f, 14.1107f, 14.3938f, 13.8885f, 14.8382f, 13.4441f)
                lineTo(20.3785f, 7.9037f)
                curveTo(20.5125f, 7.7698f, 20.4512f, 7.5391f, 20.2722f, 7.477f)
                curveTo(19.6182f, 7.2501f, 18.7675f, 6.8241f, 17.9717f, 6.0283f)
                curveTo(17.176f, 5.2326f, 16.75f, 4.3819f, 16.5231f, 3.7279f)
                curveTo(16.461f, 3.5489f, 16.2303f, 3.4876f, 16.0964f, 3.6216f)
                lineTo(10.556f, 9.1619f)
                curveTo(10.1116f, 9.6063f, 9.8894f, 9.8285f, 9.6983f, 10.0736f)
                curveTo(9.4728f, 10.3626f, 9.2796f, 10.6753f, 9.1219f, 11.0062f)
                curveTo(8.9882f, 11.2867f, 8.8888f, 11.5848f, 8.6901f, 12.181f)
                lineTo(8.4333f, 12.9515f)
                lineTo(8.0249f, 14.1765f)
                lineTo(7.642f, 15.3252f)
                curveTo(7.5442f, 15.6186f, 7.6206f, 15.9421f, 7.8393f, 16.1608f)
                curveTo(8.058f, 16.3795f, 8.3815f, 16.4559f, 8.6749f, 16.3581f)
                lineTo(9.8236f, 15.9752f)
                lineTo(11.0486f, 15.5668f)
                lineTo(11.8191f, 15.31f)
                lineTo(11.8191f, 15.31f)
                curveTo(12.4153f, 15.1113f, 12.7134f, 15.0119f, 12.9939f, 14.8782f)
                curveTo(13.3248f, 14.7205f, 13.6375f, 14.5273f, 13.9265f, 14.3018f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.1132f, 6.1691f)
                curveTo(23.2957f, 4.9866f, 23.2957f, 3.0694f, 22.1132f, 1.8869f)
                curveTo(20.9307f, 0.7044f, 19.0135f, 0.7044f, 17.831f, 1.8869f)
                lineTo(17.6529f, 2.065f)
                curveTo(17.481f, 2.2369f, 17.4032f, 2.4769f, 17.4461f, 2.7162f)
                curveTo(17.4731f, 2.8667f, 17.5232f, 3.0867f, 17.6143f, 3.3493f)
                curveTo(17.7965f, 3.8744f, 18.1405f, 4.5637f, 18.7885f, 5.2116f)
                curveTo(19.4364f, 5.8596f, 20.1257f, 6.2036f, 20.6508f, 6.3858f)
                curveTo(20.9134f, 6.4769f, 21.1334f, 6.527f, 21.2839f, 6.554f)
                curveTo(21.5231f, 6.5969f, 21.7632f, 6.5191f, 21.9351f, 6.3472f)
                lineTo(22.1132f, 6.1691f)
                close()
            }
        }
            .build()
        return _penNewRound!!
    }

private var _penNewRound: ImageVector? = null
