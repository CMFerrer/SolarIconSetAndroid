package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val MessagesConversationGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.8856f, 3.3626f)
                curveTo(11.8283f, 0.5458f, 16.5864f, 0.5458f, 19.5291f, 3.3626f)
                curveTo(19.8283f, 3.649f, 19.8387f, 4.1238f, 19.5523f, 4.423f)
                curveTo(19.2658f, 4.7222f, 18.7911f, 4.7326f, 18.4919f, 4.4462f)
                curveTo(16.1292f, 2.1846f, 12.2855f, 2.1846f, 9.9228f, 4.4462f)
                lineTo(3.5186f, 10.5764f)
                curveTo(3.2194f, 10.8628f, 2.7446f, 10.8524f, 2.4582f, 10.5532f)
                curveTo(2.1718f, 10.254f, 2.1822f, 9.7792f, 2.4814f, 9.4928f)
                lineTo(8.8856f, 3.3626f)
                close()
                moveTo(15.2666f, 6.4509f)
                curveTo(15.553f, 6.1517f, 16.0278f, 6.1413f, 16.327f, 6.4277f)
                curveTo(17.5829f, 7.6299f, 17.5829f, 9.5932f, 16.327f, 10.7953f)
                lineTo(8.4361f, 18.3486f)
                curveTo(8.1369f, 18.635f, 7.6621f, 18.6247f, 7.3757f, 18.3254f)
                curveTo(7.0893f, 18.0262f, 7.0997f, 17.5515f, 7.3989f, 17.265f)
                lineTo(15.2898f, 9.7118f)
                curveTo(15.9286f, 9.1002f, 15.9286f, 8.1229f, 15.2898f, 7.5113f)
                curveTo(14.9905f, 7.2249f, 14.9802f, 6.7501f, 15.2666f, 6.4509f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.4914f, 4.446f)
                curveTo(20.8356f, 6.6899f, 20.8356f, 10.3138f, 18.4914f, 12.5577f)
                lineTo(10.5433f, 20.1657f)
                curveTo(9.0333f, 21.6111f, 6.572f, 21.6111f, 5.062f, 20.1657f)
                curveTo(3.5705f, 18.738f, 3.5705f, 16.4373f, 5.062f, 15.0096f)
                lineTo(12.8957f, 7.5111f)
                curveTo(13.5531f, 6.8818f, 14.6319f, 6.8818f, 15.2893f, 7.5111f)
                curveTo(14.9904f, 7.2246f, 14.9803f, 6.7499f, 15.2666f, 6.4508f)
                curveTo(15.5479f, 6.1569f, 16.0108f, 6.1416f, 16.3107f, 6.4125f)
                curveTo(15.0722f, 5.243f, 13.0906f, 5.248f, 11.8585f, 6.4275f)
                lineTo(4.0248f, 13.926f)
                curveTo(1.9162f, 15.9444f, 1.9162f, 19.2309f, 4.0248f, 21.2493f)
                curveTo(6.1149f, 23.2499f, 9.4905f, 23.2499f, 11.5806f, 21.2493f)
                lineTo(19.5286f, 13.6413f)
                curveTo(22.4848f, 10.8116f, 22.4898f, 6.2127f, 19.5438f, 3.377f)
                curveTo(19.8286f, 3.6647f, 19.8339f, 4.1287f, 19.5523f, 4.4229f)
                curveTo(19.2658f, 4.7221f, 18.7906f, 4.7324f, 18.4914f, 4.446f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
