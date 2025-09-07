package com.chiksmedina.solar.lineduotone.messagesconversation

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
import com.chiksmedina.solar.lineduotone.MessagesConversationGroup

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
                moveTo(12.6644f, 5.4797f)
                lineTo(16.6367f, 9.0107f)
                curveTo(18.2053f, 10.405f, 18.9896f, 11.1022f, 18.9896f, 12.0003f)
                curveTo(18.9896f, 12.8984f, 18.2053f, 13.5956f, 16.6367f, 14.9899f)
                lineTo(12.6644f, 18.5209f)
                curveTo(11.9484f, 19.1573f, 11.5903f, 19.4755f, 11.2952f, 19.343f)
                curveTo(11.0f, 19.2104f, 11.0f, 18.7314f, 11.0f, 17.7735f)
                verticalLineTo(15.4289f)
                curveTo(7.4f, 15.4289f, 3.5f, 17.1432f, 2.0f, 20.0003f)
                curveTo(2.0f, 10.8574f, 7.3333f, 8.5717f, 11.0f, 8.5717f)
                verticalLineTo(6.2271f)
                curveTo(11.0f, 5.2691f, 11.0f, 4.7902f, 11.2952f, 4.6576f)
                curveTo(11.5903f, 4.5251f, 11.9484f, 4.8433f, 12.6644f, 5.4797f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5385f, 4.5f)
                lineTo(20.7547f, 9.3436f)
                curveTo(21.5488f, 10.081f, 22.0f, 11.1158f, 22.0f, 12.1994f)
                curveTo(22.0f, 13.3418f, 21.4988f, 14.4266f, 20.6289f, 15.1671f)
                lineTo(15.5385f, 19.5f)
            }
        }
            .build()
        return _multipleForwardRight!!
    }

private var _multipleForwardRight: ImageVector? = null
