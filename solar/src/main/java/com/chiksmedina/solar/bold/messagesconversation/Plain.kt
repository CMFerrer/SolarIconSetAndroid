package com.chiksmedina.solar.bold.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MessagesConversationGroup

val MessagesConversationGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(
            name = "Plain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.6357f, 15.6701f)
                lineTo(20.3521f, 10.5208f)
                curveTo(21.8516f, 6.0224f, 22.6013f, 3.7732f, 21.414f, 2.5859f)
                curveTo(20.2268f, 1.3987f, 17.9776f, 2.1484f, 13.4792f, 3.6479f)
                lineTo(8.3299f, 5.3643f)
                curveTo(4.6992f, 6.5745f, 2.8839f, 7.1796f, 2.3681f, 8.067f)
                curveTo(1.8773f, 8.9111f, 1.8773f, 9.9537f, 2.3681f, 10.7978f)
                curveTo(2.8839f, 11.6852f, 4.6992f, 12.2903f, 8.3299f, 13.5005f)
                curveTo(8.7798f, 13.6505f, 9.286f, 13.5434f, 9.6229f, 13.2096f)
                lineTo(15.1286f, 7.755f)
                curveTo(15.4383f, 7.4481f, 15.9382f, 7.4504f, 16.245f, 7.7601f)
                curveTo(16.5519f, 8.0699f, 16.5496f, 8.5697f, 16.2398f, 8.8766f)
                lineTo(10.8231f, 14.2432f)
                curveTo(10.4518f, 14.6111f, 10.3342f, 15.1742f, 10.4995f, 15.6701f)
                curveTo(11.7097f, 19.3007f, 12.3148f, 21.1161f, 13.2022f, 21.6319f)
                curveTo(14.0463f, 22.1227f, 15.0889f, 22.1227f, 15.933f, 21.6319f)
                curveTo(16.8204f, 21.1161f, 17.4255f, 19.3008f, 18.6357f, 15.6701f)
                close()
            }
        }
            .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
