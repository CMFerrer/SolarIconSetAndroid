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

val MessagesConversationGroup.MultipleForwardLeft: ImageVector
    get() {
        if (_multipleForwardLeft != null) {
            return _multipleForwardLeft!!
        }
        _multipleForwardLeft = Builder(
            name = "MultipleForwardLeft", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.475f, 5.1834f)
                lineTo(7.4972f, 9.6081f)
                curveTo(6.5666f, 10.4353f, 6.1013f, 10.8489f, 5.9298f, 11.3373f)
                curveTo(5.7793f, 11.7662f, 5.7793f, 12.2335f, 5.9298f, 12.6624f)
                curveTo(6.1013f, 13.1508f, 6.5666f, 13.5644f, 7.4972f, 14.3916f)
                lineTo(12.475f, 18.8163f)
                curveTo(12.8973f, 19.1917f, 13.1085f, 19.3794f, 13.2878f, 19.3861f)
                curveTo(13.4436f, 19.3919f, 13.5932f, 19.3247f, 13.6924f, 19.2044f)
                curveTo(13.8065f, 19.0659f, 13.8065f, 18.7834f, 13.8065f, 18.2184f)
                verticalLineTo(15.4284f)
                curveTo(16.2346f, 15.4284f, 18.7991f, 16.2083f, 20.6718f, 17.5926f)
                curveTo(21.6467f, 18.3133f, 22.1341f, 18.6737f, 22.3198f, 18.6595f)
                curveTo(22.5008f, 18.6456f, 22.6156f, 18.575f, 22.7095f, 18.4196f)
                curveTo(22.8058f, 18.2603f, 22.7208f, 17.7624f, 22.5506f, 16.7666f)
                curveTo(21.4456f, 10.3004f, 16.9956f, 8.5713f, 13.8065f, 8.5713f)
                verticalLineTo(5.7813f)
                curveTo(13.8065f, 5.2163f, 13.8065f, 4.9338f, 13.6924f, 4.7953f)
                curveTo(13.5932f, 4.675f, 13.4436f, 4.6078f, 13.2878f, 4.6136f)
                curveTo(13.1085f, 4.6203f, 12.8973f, 4.808f, 12.475f, 5.1834f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(9.8175f, 3.9897f)
                curveTo(9.5357f, 3.6861f, 9.0611f, 3.6686f, 8.7576f, 3.9504f)
                lineTo(3.5414f, 8.794f)
                curveTo(2.5944f, 9.6733f, 2.0564f, 10.9072f, 2.0564f, 12.1994f)
                curveTo(2.0564f, 13.5616f, 2.6541f, 14.8553f, 3.6914f, 15.7382f)
                lineTo(8.7818f, 20.0711f)
                curveTo(9.0972f, 20.3396f, 9.5706f, 20.3016f, 9.8391f, 19.9861f)
                curveTo(10.1075f, 19.6707f, 10.0695f, 19.1974f, 9.7541f, 18.9289f)
                lineTo(4.6636f, 14.596f)
                curveTo(3.9612f, 13.998f, 3.5564f, 13.122f, 3.5564f, 12.1994f)
                curveTo(3.5564f, 11.3243f, 3.9208f, 10.4887f, 4.5621f, 9.8932f)
                lineTo(9.7783f, 5.0496f)
                curveTo(10.0818f, 4.7677f, 10.0994f, 4.2932f, 9.8175f, 3.9897f)
                close()
            }
        }
            .build()
        return _multipleForwardLeft!!
    }

private var _multipleForwardLeft: ImageVector? = null
