package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0001f, 10.1308f)
                curveTo(9.6134f, 8.9767f, 11.4547f, 8.5708f, 13.0f, 8.5708f)
                verticalLineTo(6.2262f)
                curveTo(13.0f, 5.2682f, 13.0f, 4.7892f, 13.2952f, 4.6566f)
                curveTo(13.5903f, 4.5241f, 13.9484f, 4.8423f, 14.6644f, 5.4788f)
                lineTo(18.6367f, 9.0097f)
                curveTo(20.2053f, 10.404f, 20.9896f, 11.1012f, 20.9896f, 11.9993f)
                curveTo(20.9896f, 12.8975f, 20.2053f, 13.5946f, 18.6367f, 14.989f)
                lineTo(14.6644f, 18.5199f)
                curveTo(13.9484f, 19.1563f, 13.5903f, 19.4746f, 13.2952f, 19.342f)
                curveTo(13.0f, 19.2095f, 13.0f, 18.7305f, 13.0f, 17.7725f)
                verticalLineTo(15.4279f)
                curveTo(9.4f, 15.4279f, 5.5f, 17.1422f, 4.0f, 19.9993f)
                curveTo(4.0f, 17.5676f, 4.3773f, 15.621f, 5.0001f, 14.0735f)
            }
        }
            .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
