package com.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.PenNewSquare: ImageVector
    get() {
        if (_penNewSquare != null) {
            return _penNewSquare!!
        }
        _penNewSquare = Builder(
            name = "PenNewSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                lineTo(13.5f, 1.25f)
                curveTo(13.9142f, 1.25f, 14.25f, 1.5858f, 14.25f, 2.0f)
                curveTo(14.25f, 2.4142f, 13.9142f, 2.75f, 13.5f, 2.75f)
                horizontalLineTo(12.0f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                curveTo(5.3352f, 3.0982f, 4.5644f, 3.4251f, 3.9948f, 3.9948f)
                curveTo(3.4251f, 4.5644f, 3.0982f, 5.3352f, 2.9264f, 6.6136f)
                curveTo(2.7516f, 7.9136f, 2.75f, 9.6218f, 2.75f, 12.0f)
                curveTo(2.75f, 14.3782f, 2.7516f, 16.0864f, 2.9264f, 17.3864f)
                curveTo(3.0982f, 18.6648f, 3.4251f, 19.4355f, 3.9948f, 20.0052f)
                curveTo(4.5644f, 20.5749f, 5.3352f, 20.9018f, 6.6136f, 21.0736f)
                curveTo(7.9136f, 21.2484f, 9.6218f, 21.25f, 12.0f, 21.25f)
                curveTo(14.3782f, 21.25f, 16.0864f, 21.2484f, 17.3864f, 21.0736f)
                curveTo(18.6648f, 20.9018f, 19.4355f, 20.5749f, 20.0052f, 20.0052f)
                curveTo(20.5749f, 19.4355f, 20.9018f, 18.6648f, 21.0736f, 17.3864f)
                curveTo(21.2484f, 16.0864f, 21.25f, 14.3782f, 21.25f, 12.0f)
                verticalLineTo(10.5f)
                curveTo(21.25f, 10.0858f, 21.5858f, 9.75f, 22.0f, 9.75f)
                curveTo(22.4142f, 9.75f, 22.75f, 10.0858f, 22.75f, 10.5f)
                verticalLineTo(12.0574f)
                curveTo(22.75f, 14.3658f, 22.75f, 16.1748f, 22.5603f, 17.5863f)
                curveTo(22.366f, 19.031f, 21.9607f, 20.1711f, 21.0659f, 21.0659f)
                curveTo(20.1711f, 21.9607f, 19.031f, 22.366f, 17.5863f, 22.5603f)
                curveTo(16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f, 22.75f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 22.75f, 7.8252f, 22.75f, 6.4137f, 22.5603f)
                curveTo(4.969f, 22.366f, 3.8289f, 21.9607f, 2.9341f, 21.0659f)
                curveTo(2.0393f, 20.1711f, 1.634f, 19.031f, 1.4397f, 17.5863f)
                curveTo(1.25f, 16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(1.25f, 9.6342f, 1.25f, 7.8252f, 1.4397f, 6.4137f)
                curveTo(1.634f, 4.969f, 2.0393f, 3.8289f, 2.9341f, 2.9341f)
                curveTo(3.8289f, 2.0393f, 4.969f, 1.634f, 6.4137f, 1.4397f)
                curveTo(7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f, 1.25f)
                close()
                moveTo(16.7705f, 2.2759f)
                curveTo(18.1384f, 0.908f, 20.3562f, 0.908f, 21.7241f, 2.2759f)
                curveTo(23.092f, 3.6438f, 23.092f, 5.8616f, 21.7241f, 7.2295f)
                lineTo(15.076f, 13.8776f)
                curveTo(14.7047f, 14.2489f, 14.4721f, 14.4815f, 14.2126f, 14.684f)
                curveTo(13.9069f, 14.9224f, 13.5761f, 15.1268f, 13.2261f, 15.2936f)
                curveTo(12.929f, 15.4352f, 12.6169f, 15.5392f, 12.1188f, 15.7052f)
                lineTo(9.2143f, 16.6734f)
                curveTo(8.678f, 16.8521f, 8.0868f, 16.7126f, 7.6871f, 16.3129f)
                curveTo(7.2874f, 15.9132f, 7.1479f, 15.322f, 7.3266f, 14.7857f)
                lineTo(8.2948f, 11.8812f)
                curveTo(8.4608f, 11.3831f, 8.5648f, 11.071f, 8.7064f, 10.7739f)
                curveTo(8.8732f, 10.4239f, 9.0776f, 10.0931f, 9.316f, 9.7874f)
                curveTo(9.5185f, 9.5279f, 9.7511f, 9.2953f, 10.1224f, 8.924f)
                lineTo(16.7705f, 2.2759f)
                close()
                moveTo(20.6634f, 3.3366f)
                curveTo(19.8813f, 2.5545f, 18.6133f, 2.5545f, 17.8312f, 3.3366f)
                lineTo(17.4546f, 3.7132f)
                curveTo(17.4773f, 3.8091f, 17.509f, 3.9233f, 17.5532f, 4.0507f)
                curveTo(17.6965f, 4.4637f, 17.9677f, 5.0077f, 18.48f, 5.52f)
                curveTo(18.9923f, 6.0323f, 19.5363f, 6.3035f, 19.9493f, 6.4468f)
                curveTo(20.0767f, 6.491f, 20.1909f, 6.5227f, 20.2868f, 6.5454f)
                lineTo(20.6634f, 6.1688f)
                curveTo(21.4455f, 5.3867f, 21.4455f, 4.1187f, 20.6634f, 3.3366f)
                close()
                moveTo(19.1051f, 7.7271f)
                curveTo(18.5892f, 7.5052f, 17.9882f, 7.1495f, 17.4193f, 6.5806f)
                curveTo(16.8505f, 6.0118f, 16.4948f, 5.4108f, 16.2729f, 4.8949f)
                lineTo(11.2175f, 9.9503f)
                curveTo(10.801f, 10.3668f, 10.6376f, 10.532f, 10.4988f, 10.7099f)
                curveTo(10.3274f, 10.9297f, 10.1804f, 11.1676f, 10.0605f, 11.4192f)
                curveTo(9.9634f, 11.623f, 9.8887f, 11.8429f, 9.7024f, 12.4017f)
                lineTo(9.2705f, 13.6974f)
                lineTo(10.3026f, 14.7295f)
                lineTo(11.5983f, 14.2976f)
                curveTo(12.1571f, 14.1113f, 12.377f, 14.0366f, 12.5808f, 13.9395f)
                curveTo(12.8324f, 13.8196f, 13.0703f, 13.6726f, 13.2901f, 13.5012f)
                curveTo(13.468f, 13.3624f, 13.6332f, 13.199f, 14.0497f, 12.7825f)
                lineTo(19.1051f, 7.7271f)
                close()
            }
        }
            .build()
        return _penNewSquare!!
    }

private var _penNewSquare: ImageVector? = null
