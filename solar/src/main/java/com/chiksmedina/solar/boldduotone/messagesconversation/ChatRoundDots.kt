package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

public val MessagesConversationGroup.ChatRoundDots: ImageVector
    get() {
        if (_chatRoundDots != null) {
            return _chatRoundDots!!
        }
        _chatRoundDots = Builder(name = "ChatRoundDots", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(18.0751f, 23.0f, 23.0f, 18.0751f, 23.0f, 12.0f)
                curveTo(23.0f, 5.9249f, 18.0751f, 1.0f, 12.0f, 1.0f)
                curveTo(5.9249f, 1.0f, 1.0f, 5.9249f, 1.0f, 12.0f)
                curveTo(1.0f, 13.7596f, 1.4132f, 15.4228f, 2.1478f, 16.8977f)
                curveTo(2.343f, 17.2897f, 2.408f, 17.7377f, 2.2948f, 18.1607f)
                lineTo(1.6397f, 20.6093f)
                curveTo(1.3553f, 21.6723f, 2.3277f, 22.6447f, 3.3907f, 22.3603f)
                lineTo(5.8393f, 21.7052f)
                curveTo(6.2623f, 21.592f, 6.7103f, 21.657f, 7.1023f, 21.8522f)
                curveTo(8.5772f, 22.5868f, 10.2404f, 23.0f, 12.0f, 23.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9f, 12.0004f)
                curveTo(10.9f, 12.6079f, 11.3925f, 13.1004f, 12.0f, 13.1004f)
                curveTo(12.6075f, 13.1004f, 13.1f, 12.6079f, 13.1f, 12.0004f)
                curveTo(13.1f, 11.3929f, 12.6075f, 10.9004f, 12.0f, 10.9004f)
                curveTo(11.3925f, 10.9004f, 10.9f, 11.3929f, 10.9f, 12.0004f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 12.0004f)
                curveTo(6.5f, 12.6079f, 6.9925f, 13.1004f, 7.6f, 13.1004f)
                curveTo(8.2075f, 13.1004f, 8.7f, 12.6079f, 8.7f, 12.0004f)
                curveTo(8.7f, 11.3929f, 8.2075f, 10.9004f, 7.6f, 10.9004f)
                curveTo(6.9925f, 10.9004f, 6.5f, 11.3929f, 6.5f, 12.0004f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3f, 12.0004f)
                curveTo(15.3f, 12.6079f, 15.7925f, 13.1004f, 16.4f, 13.1004f)
                curveTo(17.0075f, 13.1004f, 17.5f, 12.6079f, 17.5f, 12.0004f)
                curveTo(17.5f, 11.3929f, 17.0075f, 10.9004f, 16.4f, 10.9004f)
                curveTo(15.7925f, 10.9004f, 15.3f, 11.3929f, 15.3f, 12.0004f)
                close()
            }
        }
        .build()
        return _chatRoundDots!!
    }

private var _chatRoundDots: ImageVector? = null
