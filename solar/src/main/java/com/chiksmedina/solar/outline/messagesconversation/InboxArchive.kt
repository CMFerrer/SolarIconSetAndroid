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

val MessagesConversationGroup.InboxArchive: ImageVector
    get() {
        if (_inboxArchive != null) {
            return _inboxArchive!!
        }
        _inboxArchive = Builder(
            name = "InboxArchive", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9426f, 1.25f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 1.25f, 16.1748f, 1.25f, 17.5863f, 1.4397f)
                curveTo(19.031f, 1.634f, 20.1711f, 2.0393f, 21.0659f, 2.9341f)
                curveTo(21.9607f, 3.8289f, 22.366f, 4.969f, 22.5603f, 6.4137f)
                curveTo(22.75f, 7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f)
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
                moveTo(6.6136f, 2.9264f)
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
                curveTo(21.25f, 9.6218f, 21.2484f, 7.9136f, 21.0736f, 6.6136f)
                curveTo(20.9018f, 5.3352f, 20.5749f, 4.5644f, 20.0052f, 3.9948f)
                curveTo(19.4355f, 3.4251f, 18.6648f, 3.0982f, 17.3864f, 2.9264f)
                curveTo(16.0864f, 2.7516f, 14.3782f, 2.75f, 12.0f, 2.75f)
                curveTo(9.6218f, 2.75f, 7.9136f, 2.7516f, 6.6136f, 2.9264f)
                close()
                moveTo(6.5f, 6.75f)
                curveTo(6.0858f, 6.75f, 5.75f, 7.0858f, 5.75f, 7.5f)
                verticalLineTo(8.378f)
                curveTo(5.9846f, 8.2951f, 6.237f, 8.25f, 6.5f, 8.25f)
                horizontalLineTo(17.5f)
                curveTo(17.763f, 8.25f, 18.0154f, 8.2951f, 18.25f, 8.378f)
                verticalLineTo(7.5f)
                curveTo(18.25f, 7.0858f, 17.9142f, 6.75f, 17.5f, 6.75f)
                horizontalLineTo(6.5f)
                close()
                moveTo(19.75f, 7.5f)
                curveTo(19.75f, 6.2574f, 18.7426f, 5.25f, 17.5f, 5.25f)
                horizontalLineTo(6.5f)
                curveTo(5.2574f, 5.25f, 4.25f, 6.2574f, 4.25f, 7.5f)
                verticalLineTo(14.25f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 14.25f, 3.25f, 14.5858f, 3.25f, 15.0f)
                curveTo(3.25f, 15.4142f, 3.5858f, 15.75f, 4.0f, 15.75f)
                horizontalLineTo(6.3015f)
                curveTo(7.1704f, 15.75f, 7.3989f, 15.7629f, 7.5939f, 15.8423f)
                curveTo(7.6145f, 15.8507f, 7.6349f, 15.8597f, 7.6551f, 15.8692f)
                curveTo(7.8455f, 15.9589f, 8.0097f, 16.1183f, 8.5981f, 16.7578f)
                lineTo(8.6335f, 16.7963f)
                curveTo(8.6591f, 16.8242f, 8.6844f, 16.8517f, 8.7094f, 16.8789f)
                curveTo(9.1465f, 17.3549f, 9.4919f, 17.731f, 9.9446f, 17.9581f)
                curveTo(10.0289f, 18.0004f, 10.1153f, 18.0383f, 10.2035f, 18.0717f)
                curveTo(10.6771f, 18.2511f, 11.1877f, 18.2506f, 11.834f, 18.2501f)
                curveTo(11.871f, 18.25f, 11.9083f, 18.25f, 11.9462f, 18.25f)
                curveTo(11.9819f, 18.25f, 12.0171f, 18.25f, 12.052f, 18.2501f)
                curveTo(12.6634f, 18.2506f, 13.1464f, 18.251f, 13.5987f, 18.089f)
                curveTo(13.683f, 18.0588f, 13.7658f, 18.0245f, 13.8467f, 17.9863f)
                curveTo(14.2811f, 17.781f, 14.6223f, 17.4392f, 15.0543f, 17.0065f)
                curveTo(15.0789f, 16.9818f, 15.1038f, 16.9568f, 15.1291f, 16.9316f)
                lineTo(15.3588f, 16.7019f)
                curveTo(15.9801f, 16.0806f, 16.1524f, 15.927f, 16.3501f, 15.8451f)
                curveTo(16.5477f, 15.7633f, 16.7782f, 15.75f, 17.6569f, 15.75f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 15.75f, 20.75f, 15.4142f, 20.75f, 15.0f)
                curveTo(20.75f, 14.5858f, 20.4142f, 14.25f, 20.0f, 14.25f)
                horizontalLineTo(19.75f)
                verticalLineTo(7.5f)
                close()
                moveTo(18.25f, 10.5f)
                curveTo(18.25f, 10.0858f, 17.9142f, 9.75f, 17.5f, 9.75f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 9.75f, 5.75f, 10.0858f, 5.75f, 10.5f)
                verticalLineTo(11.378f)
                curveTo(5.9846f, 11.2951f, 6.237f, 11.25f, 6.5f, 11.25f)
                horizontalLineTo(17.5f)
                curveTo(17.763f, 11.25f, 18.0154f, 11.2951f, 18.25f, 11.378f)
                verticalLineTo(10.5f)
                close()
                moveTo(18.25f, 13.5f)
                curveTo(18.25f, 13.0858f, 17.9142f, 12.75f, 17.5f, 12.75f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 12.75f, 5.75f, 13.0858f, 5.75f, 13.5f)
                verticalLineTo(14.25f)
                horizontalLineTo(6.3015f)
                curveTo(6.3419f, 14.25f, 6.3818f, 14.25f, 6.4212f, 14.2499f)
                curveTo(7.1118f, 14.2493f, 7.6578f, 14.2488f, 8.1597f, 14.4531f)
                curveTo(8.2051f, 14.4716f, 8.25f, 14.4913f, 8.2943f, 14.5122f)
                curveTo(8.7845f, 14.7432f, 9.1539f, 15.1454f, 9.6209f, 15.654f)
                curveTo(9.6476f, 15.6831f, 9.6746f, 15.7125f, 9.702f, 15.7422f)
                lineTo(9.7374f, 15.7807f)
                curveTo(10.2877f, 16.3789f, 10.4413f, 16.5291f, 10.6172f, 16.6173f)
                curveTo(10.6555f, 16.6365f, 10.6948f, 16.6538f, 10.7348f, 16.6689f)
                curveTo(10.9189f, 16.7387f, 11.1333f, 16.75f, 11.9462f, 16.75f)
                curveTo(12.7143f, 16.75f, 12.9171f, 16.7398f, 13.093f, 16.6768f)
                curveTo(13.1313f, 16.6631f, 13.1689f, 16.6475f, 13.2057f, 16.6301f)
                curveTo(13.3746f, 16.5503f, 13.5252f, 16.4141f, 14.0684f, 15.8709f)
                lineTo(14.2981f, 15.6412f)
                curveTo(14.3269f, 15.6124f, 14.3554f, 15.5839f, 14.3835f, 15.5557f)
                curveTo(14.877f, 15.0613f, 15.2676f, 14.6699f, 15.776f, 14.4593f)
                curveTo(16.2845f, 14.2487f, 16.8374f, 14.2493f, 17.536f, 14.2499f)
                curveTo(17.5758f, 14.25f, 17.6161f, 14.25f, 17.6569f, 14.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(13.5f)
                close()
            }
        }
            .build()
        return _inboxArchive!!
    }

private var _inboxArchive: ImageVector? = null
