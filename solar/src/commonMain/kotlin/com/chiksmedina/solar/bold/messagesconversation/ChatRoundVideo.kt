package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.ChatRoundVideo: ImageVector
    get() {
        if (_chatRoundVideo != null) {
            return _chatRoundVideo!!
        }
        _chatRoundVideo = Builder(
            name = "ChatRoundVideo", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(10.4003f, 22.0f, 8.8884f, 21.6244f, 7.5475f, 20.9565f)
                curveTo(7.1912f, 20.7791f, 6.7839f, 20.72f, 6.3994f, 20.8229f)
                lineTo(4.1733f, 21.4185f)
                curveTo(3.207f, 21.677f, 2.3229f, 20.793f, 2.5815f, 19.8267f)
                lineTo(3.1771f, 17.6006f)
                curveTo(3.28f, 17.2161f, 3.2209f, 16.8088f, 3.0435f, 16.4525f)
                curveTo(2.3756f, 15.1116f, 2.0f, 13.5997f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(16.0f, 11.1555f, 15.0732f, 10.586f, 13.2196f, 9.4469f)
                curveTo(11.3406f, 8.2923f, 10.4011f, 7.715f, 9.7006f, 8.1389f)
                curveTo(9.0f, 8.5628f, 9.0f, 9.7085f, 9.0f, 12.0f)
                curveTo(9.0f, 14.2915f, 9.0f, 15.4372f, 9.7006f, 15.8611f)
                curveTo(10.4011f, 16.285f, 11.3406f, 15.7077f, 13.2196f, 14.5531f)
                curveTo(15.0732f, 13.414f, 16.0f, 12.8445f, 16.0f, 12.0f)
                close()
            }
        }
            .build()
        return _chatRoundVideo!!
    }

private var _chatRoundVideo: ImageVector? = null
