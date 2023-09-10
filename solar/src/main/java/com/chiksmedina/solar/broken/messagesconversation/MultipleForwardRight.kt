package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

val MessagesConversationGroup.MultipleForwardRight: ImageVector
    get() {
        if (_multipleForwardRight != null) {
            return _multipleForwardRight!!
        }
        _multipleForwardRight = Builder(
            name = "MultipleForwardRight", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.9999f, 10.1308f)
                curveTo(7.6132f, 8.9767f, 9.4545f, 8.5708f, 10.9998f, 8.5708f)
                verticalLineTo(6.2262f)
                curveTo(10.9998f, 5.2682f, 10.9998f, 4.7892f, 11.2949f, 4.6566f)
                curveTo(11.5901f, 4.5241f, 11.9481f, 4.8423f, 12.6641f, 5.4788f)
                lineTo(16.6364f, 9.0097f)
                curveTo(18.205f, 10.404f, 18.9894f, 11.1012f, 18.9894f, 11.9993f)
                curveTo(18.9894f, 12.8975f, 18.205f, 13.5946f, 16.6364f, 14.989f)
                lineTo(12.6641f, 18.5199f)
                curveTo(11.9481f, 19.1563f, 11.5901f, 19.4746f, 11.2949f, 19.342f)
                curveTo(10.9998f, 19.2095f, 10.9998f, 18.7305f, 10.9998f, 17.7725f)
                verticalLineTo(15.4279f)
                curveTo(7.3998f, 15.4279f, 3.4998f, 17.1422f, 1.9998f, 19.9993f)
                curveTo(1.9998f, 17.5676f, 2.377f, 15.621f, 2.9999f, 14.0735f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5386f, 4.5f)
                lineTo(20.7548f, 9.3436f)
                curveTo(21.5489f, 10.081f, 22.0001f, 11.1158f, 22.0001f, 12.1994f)
                curveTo(22.0001f, 13.3418f, 21.4989f, 14.4266f, 20.629f, 15.1671f)
                lineTo(15.5386f, 19.5f)
            }
        }
            .build()
        return _multipleForwardRight!!
    }

private var _multipleForwardRight: ImageVector? = null
