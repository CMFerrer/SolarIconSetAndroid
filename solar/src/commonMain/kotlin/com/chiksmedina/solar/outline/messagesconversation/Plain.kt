package com.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(
            name = "Plain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.1437f, 3.6308f)
                curveTo(16.9737f, 3.839f, 15.3964f, 4.3626f, 13.1827f, 5.1005f)
                lineTo(8.1714f, 6.7709f)
                curveTo(6.3914f, 7.3643f, 5.1021f, 7.7947f, 4.1915f, 8.182f)
                curveTo(3.2394f, 8.5869f, 2.9007f, 8.8692f, 2.7907f, 9.0584f)
                curveTo(2.4519f, 9.6412f, 2.4519f, 10.361f, 2.7907f, 10.9437f)
                curveTo(2.9007f, 11.1329f, 3.2394f, 11.4152f, 4.1915f, 11.8201f)
                curveTo(5.1021f, 12.2075f, 6.3914f, 12.6379f, 8.1714f, 13.2312f)
                curveTo(8.1995f, 13.2406f, 8.2273f, 13.2498f, 8.2547f, 13.2589f)
                curveTo(8.6343f, 13.3852f, 8.948f, 13.4895f, 9.222f, 13.6328f)
                lineTo(14.5454f, 8.3681f)
                curveTo(14.8471f, 8.0697f, 15.3335f, 8.0724f, 15.6319f, 8.3741f)
                curveTo(15.9303f, 8.6758f, 15.9276f, 9.1623f, 15.6259f, 9.4607f)
                lineTo(10.3259f, 14.7022f)
                curveTo(10.4912f, 14.994f, 10.603f, 15.3302f, 10.7411f, 15.7453f)
                curveTo(10.7502f, 15.7727f, 10.7594f, 15.8005f, 10.7688f, 15.8286f)
                curveTo(11.3621f, 17.6086f, 11.7925f, 18.8979f, 12.1799f, 19.8085f)
                curveTo(12.5848f, 20.7606f, 12.867f, 21.0993f, 13.0563f, 21.2093f)
                curveTo(13.639f, 21.5481f, 14.3588f, 21.5481f, 14.9416f, 21.2093f)
                curveTo(15.1308f, 21.0993f, 15.4131f, 20.7606f, 15.818f, 19.8085f)
                curveTo(16.2053f, 18.8979f, 16.6357f, 17.6086f, 17.2291f, 15.8286f)
                lineTo(18.8995f, 10.8173f)
                curveTo(19.6374f, 8.6036f, 20.161f, 7.0263f, 20.3692f, 5.8563f)
                curveTo(20.5783f, 4.6807f, 20.4185f, 4.1814f, 20.1185f, 3.8815f)
                curveTo(19.8186f, 3.5815f, 19.3193f, 3.4217f, 18.1437f, 3.6308f)
                close()
                moveTo(17.8746f, 2.118f)
                curveTo(19.1768f, 1.8863f, 20.3496f, 1.9394f, 21.2051f, 2.7949f)
                curveTo(22.0606f, 3.6504f, 22.1137f, 4.8232f, 21.882f, 6.1254f)
                curveTo(21.6518f, 7.4198f, 21.0903f, 9.1041f, 20.3794f, 11.2367f)
                lineTo(18.6745f, 16.3515f)
                curveTo(18.096f, 18.0869f, 17.6465f, 19.4354f, 17.232f, 20.41f)
                curveTo(16.8322f, 21.35f, 16.3882f, 22.1457f, 15.7139f, 22.5377f)
                curveTo(14.6537f, 23.1541f, 13.3442f, 23.1541f, 12.284f, 22.5377f)
                curveTo(11.6096f, 22.1457f, 11.1657f, 21.35f, 10.7658f, 20.41f)
                curveTo(10.3513f, 19.4354f, 9.9018f, 18.0869f, 9.3234f, 16.3515f)
                lineTo(9.3111f, 16.3145f)
                curveTo(9.1084f, 15.7065f, 9.0466f, 15.5416f, 8.9591f, 15.4109f)
                curveTo(8.8611f, 15.2646f, 8.7354f, 15.1389f, 8.5891f, 15.0409f)
                curveTo(8.4584f, 14.9534f, 8.2935f, 14.8916f, 7.6855f, 14.689f)
                lineTo(7.6484f, 14.6766f)
                curveTo(5.9131f, 14.0982f, 4.5646f, 13.6487f, 3.59f, 13.2342f)
                curveTo(2.65f, 12.8343f, 1.8543f, 12.3904f, 1.4623f, 11.716f)
                curveTo(0.8459f, 10.6558f, 0.8459f, 9.3463f, 1.4623f, 8.2861f)
                curveTo(1.8543f, 7.6118f, 2.65f, 7.1678f, 3.59f, 6.768f)
                curveTo(4.5646f, 6.3534f, 5.9131f, 5.904f, 7.6485f, 5.3255f)
                lineTo(12.7633f, 3.6206f)
                curveTo(14.8959f, 2.9097f, 16.5803f, 2.3482f, 17.8746f, 2.118f)
                close()
            }
        }
            .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
