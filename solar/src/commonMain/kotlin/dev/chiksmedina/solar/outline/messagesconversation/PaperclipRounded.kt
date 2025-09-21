package dev.chiksmedina.solar.outline.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MessagesConversationGroup

val MessagesConversationGroup.PaperclipRounded: ImageVector
    get() {
        if (_paperclipRounded != null) {
            return _paperclipRounded!!
        }
        _paperclipRounded = Builder(
            name = "PaperclipRounded", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.7312f, 1.9279f)
                curveTo(12.4894f, 1.024f, 14.5708f, 1.024f, 16.329f, 1.9279f)
                curveTo(17.1995f, 2.3755f, 17.9893f, 3.1725f, 19.3013f, 4.4968f)
                curveTo(19.3398f, 4.5356f, 19.3787f, 4.5749f, 19.4181f, 4.6146f)
                curveTo(19.4571f, 4.6539f, 19.4956f, 4.6928f, 19.5337f, 4.7312f)
                curveTo(20.8473f, 6.0563f, 21.6369f, 6.8527f, 22.0799f, 7.7299f)
                curveTo(22.9734f, 9.4993f, 22.9734f, 11.5928f, 22.0799f, 13.3622f)
                curveTo(21.6369f, 14.2394f, 20.8473f, 15.0358f, 19.5337f, 16.361f)
                curveTo(19.4956f, 16.3994f, 19.4571f, 16.4382f, 19.4181f, 16.4775f)
                lineTo(15.7039f, 20.2251f)
                curveTo(15.389f, 20.543f, 15.179f, 20.7549f, 14.9706f, 20.9163f)
                curveTo(13.5348f, 22.0279f, 11.5363f, 22.0279f, 10.1005f, 20.9163f)
                curveTo(9.8921f, 20.7549f, 9.6821f, 20.543f, 9.3672f, 20.2252f)
                lineTo(9.2833f, 20.1406f)
                curveTo(8.9682f, 19.8227f, 8.7582f, 19.6108f, 8.5984f, 19.4008f)
                curveTo(7.5001f, 17.9565f, 7.5001f, 15.9496f, 8.5984f, 14.5054f)
                curveTo(8.7582f, 14.2953f, 8.9682f, 14.0835f, 9.2833f, 13.7656f)
                curveTo(9.2971f, 13.7517f, 9.311f, 13.7376f, 9.3252f, 13.7234f)
                lineTo(12.1558f, 10.8672f)
                curveTo(12.4474f, 10.573f, 12.9223f, 10.5709f, 13.2165f, 10.8625f)
                curveTo(13.5107f, 11.1541f, 13.5128f, 11.6289f, 13.2212f, 11.9231f)
                lineTo(10.3906f, 14.7793f)
                curveTo(10.0185f, 15.1546f, 9.8847f, 15.292f, 9.7924f, 15.4134f)
                curveTo(9.1021f, 16.3211f, 9.1021f, 17.5851f, 9.7924f, 18.4928f)
                curveTo(9.8847f, 18.6141f, 10.0185f, 18.7515f, 10.3906f, 19.1269f)
                curveTo(10.7627f, 19.5023f, 10.8987f, 19.6372f, 11.0187f, 19.7302f)
                curveTo(11.9139f, 20.4233f, 13.1571f, 20.4233f, 14.0523f, 19.7302f)
                curveTo(14.1724f, 19.6372f, 14.3084f, 19.5023f, 14.6805f, 19.1269f)
                lineTo(18.3527f, 15.4216f)
                curveTo(19.8175f, 13.9436f, 20.4187f, 13.324f, 20.7409f, 12.686f)
                curveTo(21.4197f, 11.3418f, 21.4197f, 9.7503f, 20.7409f, 8.4061f)
                curveTo(20.4187f, 7.7682f, 19.8175f, 7.1485f, 18.3527f, 5.6705f)
                curveTo(16.8874f, 4.192f, 16.2739f, 3.5862f, 15.6431f, 3.2619f)
                curveTo(14.3154f, 2.5793f, 12.7448f, 2.5793f, 11.4171f, 3.2619f)
                curveTo(10.7863f, 3.5862f, 10.1728f, 4.192f, 8.7075f, 5.6705f)
                lineTo(4.9778f, 9.4337f)
                curveTo(4.1555f, 10.2634f, 3.8155f, 10.6106f, 3.5887f, 10.939f)
                curveTo(2.4704f, 12.5579f, 2.4704f, 14.7097f, 3.5887f, 16.3285f)
                curveTo(3.8155f, 16.6569f, 4.1555f, 17.0041f, 4.9778f, 17.8339f)
                curveTo(5.2694f, 18.1281f, 5.2673f, 18.6029f, 4.9731f, 18.8945f)
                curveTo(4.6789f, 19.1861f, 4.204f, 19.184f, 3.9125f, 18.8898f)
                lineTo(3.8474f, 18.8241f)
                curveTo(3.1095f, 18.0798f, 2.6666f, 17.6329f, 2.3545f, 17.181f)
                curveTo(0.8818f, 15.0491f, 0.8818f, 12.2184f, 2.3545f, 10.0865f)
                curveTo(2.6666f, 9.6346f, 3.1095f, 9.1878f, 3.8474f, 8.4434f)
                curveTo(3.8688f, 8.4218f, 3.8905f, 8.3999f, 3.9125f, 8.3778f)
                lineTo(7.6421f, 4.6146f)
                curveTo(7.6814f, 4.5749f, 7.7204f, 4.5356f, 7.7588f, 4.4968f)
                curveTo(9.0709f, 3.1725f, 9.8607f, 2.3755f, 10.7312f, 1.9279f)
                close()
            }
        }
            .build()
        return _paperclipRounded!!
    }

private var _paperclipRounded: ImageVector? = null
