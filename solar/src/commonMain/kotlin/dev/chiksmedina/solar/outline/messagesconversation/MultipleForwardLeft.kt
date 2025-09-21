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
                pathFillType = EvenOdd
            ) {
                moveTo(9.0109f, 3.9897f)
                curveTo(9.2927f, 4.2932f, 9.2752f, 4.7677f, 8.9716f, 5.0496f)
                lineTo(3.7554f, 9.8932f)
                curveTo(3.1141f, 10.4887f, 2.7498f, 11.3243f, 2.7498f, 12.1994f)
                curveTo(2.7498f, 13.122f, 3.1545f, 13.998f, 3.857f, 14.596f)
                lineTo(8.9474f, 18.9289f)
                curveTo(9.2628f, 19.1974f, 9.3009f, 19.6707f, 9.0324f, 19.9861f)
                curveTo(8.7639f, 20.3016f, 8.2906f, 20.3396f, 7.9752f, 20.0711f)
                lineTo(2.8847f, 15.7382f)
                curveTo(1.8474f, 14.8553f, 1.2498f, 13.5616f, 1.2498f, 12.1994f)
                curveTo(1.2498f, 10.9072f, 1.7878f, 9.6733f, 2.7348f, 8.794f)
                lineTo(7.951f, 3.9504f)
                curveTo(8.2545f, 3.6686f, 8.729f, 3.6861f, 9.0109f, 3.9897f)
                close()
                moveTo(12.2469f, 5.677f)
                curveTo(12.1338f, 5.7739f, 11.9988f, 5.8934f, 11.8339f, 6.04f)
                lineTo(7.8616f, 9.5709f)
                curveTo(7.0605f, 10.283f, 6.52f, 10.7658f, 6.1698f, 11.1773f)
                curveTo(5.8335f, 11.5725f, 5.7604f, 11.8033f, 5.7604f, 12.0f)
                curveTo(5.7604f, 12.1967f, 5.8335f, 12.4275f, 6.1698f, 12.8227f)
                curveTo(6.52f, 13.2342f, 7.0605f, 13.717f, 7.8616f, 14.4291f)
                lineTo(11.8339f, 17.96f)
                curveTo(11.9988f, 18.1066f, 12.1338f, 18.2261f, 12.2469f, 18.323f)
                curveTo(12.2496f, 18.1742f, 12.25f, 17.9939f, 12.25f, 17.7732f)
                verticalLineTo(15.4286f)
                curveTo(12.25f, 15.0144f, 12.5858f, 14.6786f, 13.0f, 14.6786f)
                curveTo(14.9125f, 14.6786f, 16.9f, 15.1325f, 18.616f, 15.9686f)
                curveTo(19.5348f, 16.4163f, 20.3902f, 16.981f, 21.1161f, 17.6568f)
                curveTo(20.7473f, 14.6098f, 19.6576f, 12.6439f, 18.3565f, 11.399f)
                curveTo(16.7364f, 9.849f, 14.6896f, 9.3214f, 13.0f, 9.3214f)
                curveTo(12.5858f, 9.3214f, 12.25f, 8.9857f, 12.25f, 8.5714f)
                verticalLineTo(6.2269f)
                curveTo(12.25f, 6.0061f, 12.2496f, 5.8259f, 12.2469f, 5.677f)
                close()
                moveTo(11.7648f, 4.1541f)
                curveTo(12.0217f, 3.9845f, 12.4888f, 3.7381f, 13.0121f, 3.9731f)
                curveTo(13.5353f, 4.2081f, 13.6615f, 4.7209f, 13.7054f, 5.0256f)
                curveTo(13.7501f, 5.3358f, 13.7501f, 5.741f, 13.75f, 6.1751f)
                curveTo(13.75f, 6.1923f, 13.75f, 6.2096f, 13.75f, 6.2269f)
                verticalLineTo(7.8506f)
                curveTo(15.5736f, 7.9921f, 17.6719f, 8.668f, 19.3935f, 10.3152f)
                curveTo(21.3686f, 12.2051f, 22.75f, 15.279f, 22.75f, 20.0f)
                curveTo(22.75f, 20.3451f, 22.5145f, 20.6456f, 22.1795f, 20.7282f)
                curveTo(21.8445f, 20.8108f, 21.4963f, 20.6541f, 21.3359f, 20.3486f)
                curveTo(20.6802f, 19.0996f, 19.4719f, 18.0543f, 17.959f, 17.3171f)
                curveTo(16.6724f, 16.6902f, 15.2015f, 16.3047f, 13.75f, 16.2046f)
                verticalLineTo(17.7732f)
                curveTo(13.75f, 17.7904f, 13.75f, 17.8077f, 13.75f, 17.8249f)
                curveTo(13.7501f, 18.259f, 13.7501f, 18.6642f, 13.7054f, 18.9744f)
                curveTo(13.6615f, 19.2791f, 13.5353f, 19.7919f, 13.0121f, 20.0269f)
                curveTo(12.4888f, 20.2619f, 12.0217f, 20.0155f, 11.7648f, 19.8459f)
                curveTo(11.5032f, 19.6732f, 11.2004f, 19.404f, 10.876f, 19.1155f)
                curveTo(10.8631f, 19.1041f, 10.8503f, 19.0926f, 10.8373f, 19.0811f)
                lineTo(6.8235f, 15.5133f)
                curveTo(6.0746f, 14.8476f, 5.4537f, 14.2958f, 5.0274f, 13.7948f)
                curveTo(4.5794f, 13.2683f, 4.2604f, 12.7014f, 4.2604f, 12.0f)
                curveTo(4.2604f, 11.2986f, 4.5794f, 10.7317f, 5.0274f, 10.2052f)
                curveTo(5.4537f, 9.7043f, 6.0746f, 9.1524f, 6.8235f, 8.4867f)
                lineTo(10.8373f, 4.9189f)
                curveTo(10.8503f, 4.9074f, 10.8631f, 4.8959f, 10.876f, 4.8845f)
                curveTo(11.2004f, 4.596f, 11.5032f, 4.3268f, 11.7648f, 4.1541f)
                close()
            }
        }
            .build()
        return _multipleForwardLeft!!
    }

private var _multipleForwardLeft: ImageVector? = null
