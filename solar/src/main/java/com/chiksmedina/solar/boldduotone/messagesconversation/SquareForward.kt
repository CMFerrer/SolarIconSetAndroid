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

public val MessagesConversationGroup.SquareForward: ImageVector
    get() {
        if (_squareForward != null) {
            return _squareForward!!
        }
        _squareForward = Builder(name = "SquareForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 13.5299f)
                curveTo(1.0f, 8.863f, 1.0f, 6.5295f, 2.4498f, 5.0797f)
                curveTo(3.8996f, 3.6299f, 6.2331f, 3.6299f, 10.9f, 3.6299f)
                curveTo(15.5669f, 3.6299f, 17.9004f, 3.6299f, 19.3502f, 5.0797f)
                curveTo(20.8f, 6.5295f, 20.8f, 8.863f, 20.8f, 13.5299f)
                curveTo(20.8f, 18.1968f, 20.8f, 20.5302f, 19.3502f, 21.9801f)
                curveTo(17.9004f, 23.4299f, 15.5669f, 23.4299f, 10.9f, 23.4299f)
                curveTo(6.2331f, 23.4299f, 3.8996f, 23.4299f, 2.4498f, 21.9801f)
                curveTo(1.0f, 20.5302f, 1.0f, 18.1968f, 1.0f, 13.5299f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6703f, 1.9073f)
                lineTo(20.2633f, 4.1545f)
                curveTo(22.0483f, 5.7015f, 22.9408f, 6.475f, 22.9408f, 7.4795f)
                curveTo(22.9408f, 8.4841f, 22.0483f, 9.2576f, 20.2633f, 10.8046f)
                lineTo(17.6703f, 13.0519f)
                curveTo(16.8855f, 13.7321f, 16.493f, 14.0722f, 16.1715f, 13.9254f)
                curveTo(15.8499f, 13.7786f, 15.8499f, 13.2592f, 15.8499f, 12.2206f)
                verticalLineTo(10.5438f)
                curveTo(13.1999f, 10.5438f, 10.3726f, 11.5318f, 8.6496f, 13.2434f)
                curveTo(8.1249f, 13.7646f, 7.8625f, 14.0252f, 7.7229f, 13.9591f)
                curveTo(7.5832f, 13.8929f, 7.6157f, 13.5563f, 7.6807f, 12.883f)
                curveTo(8.3289f, 6.1615f, 12.7424f, 4.4153f, 15.8499f, 4.4153f)
                verticalLineTo(2.7385f)
                curveTo(15.8499f, 1.6999f, 15.8499f, 1.1805f, 16.1715f, 1.0337f)
                curveTo(16.493f, 0.8869f, 16.8855f, 1.227f, 17.6703f, 1.9073f)
                close()
            }
        }
        .build()
        return _squareForward!!
    }

private var _squareForward: ImageVector? = null
