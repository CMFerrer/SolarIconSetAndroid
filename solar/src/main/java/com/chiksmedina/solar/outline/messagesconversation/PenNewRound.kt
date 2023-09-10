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

val MessagesConversationGroup.PenNewRound: ImageVector
    get() {
        if (_penNewRound != null) {
            return _penNewRound!!
        }
        _penNewRound = Builder(
            name = "PenNewRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                curveTo(12.75f, 2.4142f, 12.4142f, 2.75f, 12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 11.5858f, 21.5858f, 11.25f, 22.0f, 11.25f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
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
        return _penNewRound!!
    }

private var _penNewRound: ImageVector? = null
