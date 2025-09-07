package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

val MessagesConversationGroup.Plain2: ImageVector
    get() {
        if (_plain2 != null) {
            return _plain2!!
        }
        _plain2 = Builder(
            name = "Plain2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.7962f, 18.2037f)
                lineTo(21.5122f, 2.4878f)
                curveTo(20.5237f, 1.4994f, 18.6511f, 2.1236f, 14.906f, 3.3719f)
                lineTo(5.5748f, 6.4822f)
                curveTo(3.4929f, 7.1761f, 2.452f, 7.523f, 2.1361f, 8.2864f)
                curveTo(2.0618f, 8.4658f, 2.0169f, 8.656f, 2.0031f, 8.8496f)
                curveTo(1.9443f, 9.6736f, 2.7202f, 10.4495f, 4.2719f, 12.0011f)
                lineTo(4.5545f, 12.2837f)
                curveTo(4.8092f, 12.5384f, 4.9366f, 12.6658f, 5.0328f, 12.8075f)
                curveTo(5.2227f, 13.0871f, 5.3305f, 13.4143f, 5.3439f, 13.7519f)
                curveTo(5.3508f, 13.9232f, 5.324f, 14.1013f, 5.2706f, 14.4574f)
                curveTo(5.0749f, 15.7612f, 4.977f, 16.4131f, 5.0923f, 16.9147f)
                curveTo(5.2062f, 17.4105f, 5.4539f, 17.8534f, 5.7962f, 18.2037f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.4976f, 18.4856f)
                lineTo(20.6282f, 9.0942f)
                curveTo(21.8766f, 5.3492f, 22.5008f, 3.4767f, 21.5123f, 2.4883f)
                lineTo(5.7964f, 18.2042f)
                curveTo(6.1444f, 18.5604f, 6.5903f, 18.8208f, 7.0927f, 18.9438f)
                curveTo(7.5927f, 19.0661f, 8.2459f, 18.9774f, 9.5524f, 18.8001f)
                lineTo(9.6238f, 18.7904f)
                curveTo(9.9921f, 18.7404f, 10.1762f, 18.7155f, 10.353f, 18.7261f)
                curveTo(10.674f, 18.7455f, 10.984f, 18.85f, 11.2511f, 19.029f)
                curveTo(11.3983f, 19.1276f, 11.5297f, 19.259f, 11.7925f, 19.5217f)
                lineTo(12.0437f, 19.773f)
                curveTo(13.554f, 21.2832f, 14.3092f, 22.0383f, 15.1102f, 21.999f)
                curveTo(15.3311f, 21.9882f, 15.548f, 21.9369f, 15.7504f, 21.8479f)
                curveTo(16.4845f, 21.5248f, 16.8222f, 20.5117f, 17.4976f, 18.4856f)
                close()
            }
        }
            .build()
        return _plain2!!
    }

private var _plain2: ImageVector? = null
