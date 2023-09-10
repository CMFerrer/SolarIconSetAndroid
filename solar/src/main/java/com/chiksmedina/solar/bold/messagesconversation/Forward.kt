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

val MessagesConversationGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(
            name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.9549f, 5.1834f)
                lineTo(18.9328f, 9.6081f)
                curveTo(19.8634f, 10.4353f, 20.3286f, 10.8489f, 20.5001f, 11.3373f)
                curveTo(20.6507f, 11.7662f, 20.6507f, 12.2335f, 20.5001f, 12.6624f)
                curveTo(20.3286f, 13.1508f, 19.8634f, 13.5644f, 18.9328f, 14.3916f)
                lineTo(13.9549f, 18.8163f)
                curveTo(13.5326f, 19.1917f, 13.3215f, 19.3794f, 13.1422f, 19.3861f)
                curveTo(12.9864f, 19.3919f, 12.8367f, 19.3247f, 12.7376f, 19.2044f)
                curveTo(12.6235f, 19.0659f, 12.6235f, 18.7834f, 12.6235f, 18.2184f)
                verticalLineTo(15.4284f)
                curveTo(10.1954f, 15.4284f, 7.6308f, 16.2083f, 5.7582f, 17.5926f)
                curveTo(4.7833f, 18.3133f, 4.2958f, 18.6737f, 4.1102f, 18.6595f)
                curveTo(3.9292f, 18.6456f, 3.8143f, 18.575f, 3.7204f, 18.4196f)
                curveTo(3.6241f, 18.2603f, 3.7092f, 17.7624f, 3.8794f, 16.7666f)
                curveTo(4.9843f, 10.3004f, 9.4343f, 8.5713f, 12.6235f, 8.5713f)
                verticalLineTo(5.7813f)
                curveTo(12.6235f, 5.2163f, 12.6235f, 4.9338f, 12.7376f, 4.7953f)
                curveTo(12.8367f, 4.675f, 12.9864f, 4.6078f, 13.1422f, 4.6136f)
                curveTo(13.3215f, 4.6203f, 13.5326f, 4.808f, 13.9549f, 5.1834f)
                close()
            }
        }
            .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
