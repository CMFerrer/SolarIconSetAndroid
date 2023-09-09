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

public val MessagesConversationGroup.ChatRoundLine: ImageVector
    get() {
        if (_chatRoundLine != null) {
            return _chatRoundLine!!
        }
        _chatRoundLine = Builder(name = "ChatRoundLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 13.5997f, 2.3756f, 15.1116f, 3.0435f, 16.4525f)
                curveTo(3.2209f, 16.8088f, 3.28f, 17.2161f, 3.1771f, 17.6006f)
                lineTo(2.5815f, 19.8267f)
                curveTo(2.3229f, 20.793f, 3.207f, 21.677f, 4.1733f, 21.4185f)
                lineTo(6.3994f, 20.8229f)
                curveTo(6.7839f, 20.72f, 7.1912f, 20.7791f, 7.5475f, 20.9565f)
                curveTo(8.8884f, 21.6244f, 10.4003f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(8.0f, 13.25f)
                curveTo(7.5858f, 13.25f, 7.25f, 13.5858f, 7.25f, 14.0f)
                curveTo(7.25f, 14.4142f, 7.5858f, 14.75f, 8.0f, 14.75f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 14.75f, 14.25f, 14.4142f, 14.25f, 14.0f)
                curveTo(14.25f, 13.5858f, 13.9142f, 13.25f, 13.5f, 13.25f)
                horizontalLineTo(8.0f)
                close()
                moveTo(7.25f, 10.5f)
                curveTo(7.25f, 10.0858f, 7.5858f, 9.75f, 8.0f, 9.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 9.75f, 16.75f, 10.0858f, 16.75f, 10.5f)
                curveTo(16.75f, 10.9142f, 16.4142f, 11.25f, 16.0f, 11.25f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 11.25f, 7.25f, 10.9142f, 7.25f, 10.5f)
                close()
            }
        }
        .build()
        return _chatRoundLine!!
    }

private var _chatRoundLine: ImageVector? = null
