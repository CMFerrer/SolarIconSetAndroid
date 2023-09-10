package com.chiksmedina.solar.lineduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MessagesConversationGroup

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
                moveTo(14.554f, 3.9974f)
                lineTo(19.2301f, 8.1319f)
                curveTo(21.0767f, 9.7646f, 22.0f, 10.5809f, 22.0f, 11.6325f)
                curveTo(22.0f, 12.6842f, 21.0767f, 13.5005f, 19.2301f, 15.1332f)
                lineTo(14.554f, 19.2677f)
                curveTo(13.7111f, 20.0129f, 13.2897f, 20.3856f, 12.9422f, 20.2303f)
                curveTo(12.5947f, 20.0751f, 12.5947f, 19.5143f, 12.5947f, 18.3925f)
                verticalLineTo(15.6472f)
                curveTo(8.3568f, 15.6472f, 3.7658f, 17.6545f, 2.0f, 21.0f)
                curveTo(2.0f, 10.2943f, 8.2783f, 7.6179f, 12.5947f, 7.6179f)
                verticalLineTo(4.8726f)
                curveTo(12.5947f, 3.7508f, 12.5947f, 3.1899f, 12.9422f, 3.0347f)
                curveTo(13.2897f, 2.8795f, 13.7111f, 3.2522f, 14.554f, 3.9974f)
                close()
            }
        }
            .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
