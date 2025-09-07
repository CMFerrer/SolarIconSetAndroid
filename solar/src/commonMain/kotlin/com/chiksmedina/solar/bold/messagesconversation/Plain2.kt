package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.Plain2: ImageVector
    get() {
        if (_plain2 != null) {
            return _plain2!!
        }
        _plain2 = Builder(
            name = "Plain2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.4975f, 18.4851f)
                lineTo(20.6281f, 9.0938f)
                curveTo(21.419f, 6.7211f, 21.9594f, 5.1f, 21.9978f, 3.9792f)
                curveTo(22.0108f, 3.6016f, 21.5845f, 3.4762f, 21.3173f, 3.7434f)
                lineTo(6.8586f, 18.2022f)
                curveTo(6.6252f, 18.4355f, 6.6807f, 18.8286f, 6.9983f, 18.9185f)
                curveTo(7.0295f, 18.9273f, 7.0609f, 18.9356f, 7.0926f, 18.9433f)
                curveTo(7.5925f, 19.0657f, 8.2458f, 18.977f, 9.5522f, 18.7997f)
                lineTo(9.6236f, 18.79f)
                curveTo(9.9919f, 18.74f, 10.1761f, 18.715f, 10.3529f, 18.7257f)
                curveTo(10.6738f, 18.7451f, 10.9838f, 18.8496f, 11.251f, 19.0286f)
                curveTo(11.3981f, 19.1271f, 11.5295f, 19.2586f, 11.7923f, 19.5213f)
                lineTo(12.0436f, 19.7726f)
                curveTo(13.5539f, 21.2828f, 14.309f, 22.0379f, 15.1101f, 21.9986f)
                curveTo(15.3309f, 21.9877f, 15.5479f, 21.9365f, 15.7503f, 21.8475f)
                curveTo(16.4844f, 21.5244f, 16.8221f, 20.5113f, 17.4975f, 18.4851f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.906f, 3.3719f)
                lineTo(5.5748f, 6.4822f)
                curveTo(3.4929f, 7.1761f, 2.452f, 7.5231f, 2.1361f, 8.2864f)
                curveTo(2.0618f, 8.4658f, 2.0169f, 8.656f, 2.0031f, 8.8497f)
                curveTo(1.9443f, 9.6737f, 2.7202f, 10.4495f, 4.2719f, 12.0012f)
                lineTo(4.5545f, 12.2838f)
                curveTo(4.8092f, 12.5385f, 4.9366f, 12.6658f, 5.0328f, 12.8076f)
                curveTo(5.2227f, 13.0871f, 5.3305f, 13.4143f, 5.3439f, 13.752f)
                curveTo(5.3508f, 13.9232f, 5.324f, 14.1013f, 5.2706f, 14.4575f)
                curveTo(5.0749f, 15.7613f, 4.977f, 16.4131f, 5.0923f, 16.9148f)
                curveTo(5.0963f, 16.9322f, 5.1005f, 16.9497f, 5.1048f, 16.967f)
                curveTo(5.1863f, 17.292f, 5.5855f, 17.3539f, 5.8224f, 17.117f)
                lineTo(20.2567f, 2.6827f)
                curveTo(20.5238f, 2.4156f, 20.3984f, 1.9893f, 20.0209f, 2.0022f)
                curveTo(18.9f, 2.0407f, 17.2788f, 2.581f, 14.906f, 3.3719f)
                close()
            }
        }
            .build()
        return _plain2!!
    }

private var _plain2: ImageVector? = null
