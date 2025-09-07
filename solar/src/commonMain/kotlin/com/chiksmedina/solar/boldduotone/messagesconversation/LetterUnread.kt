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

val MessagesConversationGroup.LetterUnread: ImageVector
    get() {
        if (_letterUnread != null) {
            return _letterUnread!!
        }
        _letterUnread = Builder(
            name = "LetterUnread", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(24.0f, 5.0f)
                curveTo(24.0f, 6.6568f, 22.6569f, 8.0f, 21.0f, 8.0f)
                curveTo(19.3431f, 8.0f, 18.0f, 6.6568f, 18.0f, 5.0f)
                curveTo(18.0f, 3.3431f, 19.3431f, 2.0f, 21.0f, 2.0f)
                curveTo(22.6569f, 2.0f, 24.0f, 3.3431f, 24.0f, 5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.2339f, 7.4639f)
                lineTo(15.6973f, 8.7444f)
                curveTo(14.671f, 9.5997f, 13.9585f, 10.1915f, 13.357f, 10.5784f)
                curveTo(12.7747f, 10.9529f, 12.3798f, 11.0786f, 12.0002f, 11.0786f)
                curveTo(11.6206f, 11.0786f, 11.2258f, 10.9529f, 10.6435f, 10.5784f)
                curveTo(10.0419f, 10.1915f, 9.3294f, 9.5997f, 8.3032f, 8.7444f)
                lineTo(5.9284f, 6.7655f)
                curveTo(5.5783f, 6.4738f, 5.0581f, 6.5211f, 4.7664f, 6.8711f)
                curveTo(4.4747f, 7.2211f, 4.522f, 7.7413f, 4.8721f, 8.033f)
                lineTo(7.2882f, 10.0465f)
                curveTo(8.2632f, 10.859f, 9.0534f, 11.5176f, 9.7509f, 11.9661f)
                curveTo(10.4775f, 12.4334f, 11.185f, 12.7286f, 12.0002f, 12.7286f)
                curveTo(12.8154f, 12.7286f, 13.523f, 12.4334f, 14.2495f, 11.9661f)
                curveTo(14.947f, 11.5176f, 15.7372f, 10.859f, 16.7122f, 10.0465f)
                lineTo(18.3785f, 8.658f)
                curveTo(17.9274f, 8.3341f, 17.5388f, 7.929f, 17.2339f, 7.4639f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.4538f, 6.5872f)
                curveTo(18.7362f, 6.5365f, 19.0372f, 6.6349f, 19.234f, 6.8711f)
                curveTo(19.3965f, 7.0661f, 19.4538f, 7.314f, 19.4121f, 7.5458f)
                curveTo(19.0244f, 7.3034f, 18.696f, 6.975f, 18.4538f, 6.5872f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.9576f, 3.021f)
                curveTo(16.156f, 3.0f, 15.2437f, 3.0f, 14.2f, 3.0f)
                horizontalLineTo(9.8f)
                curveTo(5.6516f, 3.0f, 3.5775f, 3.0f, 2.2887f, 4.318f)
                curveTo(1.0f, 5.636f, 1.0f, 7.7574f, 1.0f, 12.0f)
                curveTo(1.0f, 16.2426f, 1.0f, 18.364f, 2.2887f, 19.682f)
                curveTo(3.5775f, 21.0f, 5.6516f, 21.0f, 9.8f, 21.0f)
                horizontalLineTo(14.2f)
                curveTo(18.3484f, 21.0f, 20.4225f, 21.0f, 21.7113f, 19.682f)
                curveTo(23.0f, 18.364f, 23.0f, 16.2426f, 23.0f, 12.0f)
                curveTo(23.0f, 10.9326f, 23.0f, 9.9995f, 22.9795f, 9.1797f)
                curveTo(22.3821f, 9.4794f, 21.7103f, 9.6477f, 21.0f, 9.6477f)
                curveTo(18.5147f, 9.6477f, 16.5f, 7.5872f, 16.5f, 5.0455f)
                curveTo(16.5f, 4.319f, 16.6646f, 3.6319f, 16.9576f, 3.021f)
                close()
            }
        }
            .build()
        return _letterUnread!!
    }

private var _letterUnread: ImageVector? = null
