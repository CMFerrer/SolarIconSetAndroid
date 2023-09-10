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

val MessagesConversationGroup.ChatRoundLine: ImageVector
    get() {
        if (_chatRoundLine != null) {
            return _chatRoundLine!!
        }
        _chatRoundLine = Builder(
            name = "ChatRoundLine", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.825f, 12.85f)
                curveTo(7.3694f, 12.85f, 7.0f, 13.2194f, 7.0f, 13.675f)
                curveTo(7.0f, 14.1306f, 7.3694f, 14.5f, 7.825f, 14.5f)
                horizontalLineTo(13.875f)
                curveTo(14.3306f, 14.5f, 14.7f, 14.1306f, 14.7f, 13.675f)
                curveTo(14.7f, 13.2194f, 14.3306f, 12.85f, 13.875f, 12.85f)
                horizontalLineTo(7.825f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.825f, 9.0f)
                curveTo(7.3694f, 9.0f, 7.0f, 9.3694f, 7.0f, 9.825f)
                curveTo(7.0f, 10.2806f, 7.3694f, 10.65f, 7.825f, 10.65f)
                horizontalLineTo(16.625f)
                curveTo(17.0806f, 10.65f, 17.45f, 10.2806f, 17.45f, 9.825f)
                curveTo(17.45f, 9.3694f, 17.0806f, 9.0f, 16.625f, 9.0f)
                horizontalLineTo(7.825f)
                close()
            }
        }
            .build()
        return _chatRoundLine!!
    }

private var _chatRoundLine: ImageVector? = null
