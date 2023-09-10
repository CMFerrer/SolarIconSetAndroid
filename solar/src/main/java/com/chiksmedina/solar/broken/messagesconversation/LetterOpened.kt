package com.chiksmedina.solar.broken.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MessagesConversationGroup

val MessagesConversationGroup.LetterOpened: ImageVector
    get() {
        if (_letterOpened != null) {
            return _letterOpened!!
        }
        _letterOpened = Builder(
            name = "LetterOpened", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.0001f)
                curveTo(22.0f, 17.7713f, 22.0f, 19.6569f, 20.8284f, 20.8285f)
                curveTo(19.6569f, 22.0001f, 17.7712f, 22.0001f, 14.0f, 22.0001f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0001f, 4.3432f, 22.0001f, 3.1716f, 20.8285f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7713f, 2.0f, 14.0001f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                curveTo(3.8247f, 6.5185f, 4.6999f, 6.2294f, 6.0f, 6.1016f)
                moveTo(18.0f, 6.1016f)
                curveTo(19.3001f, 6.2294f, 20.1752f, 6.5185f, 20.8284f, 7.1716f)
                curveTo(21.4816f, 7.8248f, 21.7706f, 8.6999f, 21.8985f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 6.0f)
                horizontalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 9.0f)
                horizontalLineTo(13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 2.0029f)
                curveTo(15.7066f, 2.0174f, 16.6474f, 2.1121f, 17.2678f, 2.7325f)
                curveTo(18.0f, 3.4648f, 18.0f, 4.6433f, 18.0f, 7.0003f)
                verticalLineTo(9.0636f)
                curveTo(18.0f, 9.5242f, 18.0f, 9.7545f, 17.9056f, 9.9561f)
                curveTo(17.8112f, 10.1577f, 17.6342f, 10.3051f, 17.2804f, 10.6f)
                lineTo(16.5607f, 11.1997f)
                moveTo(10.0f, 2.0029f)
                curveTo(8.2934f, 2.0174f, 7.3526f, 2.1121f, 6.7322f, 2.7325f)
                curveTo(6.0f, 3.4648f, 6.0f, 4.6433f, 6.0f, 7.0003f)
                verticalLineTo(9.0636f)
                curveTo(6.0f, 9.5242f, 6.0f, 9.7545f, 6.0944f, 9.9561f)
                curveTo(6.1888f, 10.1577f, 6.3658f, 10.3051f, 6.7196f, 10.6f)
                lineTo(8.1589f, 11.7994f)
                curveTo(9.9955f, 13.3299f, 10.9139f, 14.0952f, 12.0f, 14.0952f)
                curveTo(12.6493f, 14.0952f, 13.2386f, 13.8217f, 14.0f, 13.2748f)
            }
        }
            .build()
        return _letterOpened!!
    }

private var _letterOpened: ImageVector? = null
