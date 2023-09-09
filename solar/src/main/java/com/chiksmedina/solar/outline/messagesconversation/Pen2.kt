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

public val MessagesConversationGroup.Pen2: ImageVector
    get() {
        if (_pen2 != null) {
            return _pen2!!
        }
        _pen2 = Builder(name = "Pen2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0992f, 2.3911f)
                curveTo(15.6207f, 0.8696f, 18.0874f, 0.8696f, 19.6089f, 2.3911f)
                curveTo(21.1304f, 3.9125f, 21.1304f, 6.3793f, 19.6089f, 7.9008f)
                lineTo(12.0149f, 15.4948f)
                curveTo(11.5869f, 15.9228f, 11.3255f, 16.1842f, 11.0342f, 16.4115f)
                curveTo(10.691f, 16.6792f, 10.3196f, 16.9087f, 9.9266f, 17.096f)
                curveTo(9.5931f, 17.2549f, 9.2424f, 17.3718f, 8.6681f, 17.5632f)
                lineTo(5.9955f, 18.4541f)
                lineTo(5.3538f, 18.668f)
                curveTo(4.7795f, 18.8594f, 4.1463f, 18.7099f, 3.7182f, 18.2818f)
                curveTo(3.2901f, 17.8537f, 3.1406f, 17.2205f, 3.332f, 16.6462f)
                lineTo(4.4368f, 13.3318f)
                curveTo(4.6282f, 12.7576f, 4.7451f, 12.4069f, 4.904f, 12.0734f)
                curveTo(5.0913f, 11.6804f, 5.3208f, 11.309f, 5.5885f, 10.9658f)
                curveTo(5.8158f, 10.6745f, 6.0772f, 10.4131f, 6.5052f, 9.9851f)
                lineTo(14.0992f, 2.3911f)
                close()
                moveTo(5.9609f, 16.8845f)
                lineTo(5.1155f, 16.0391f)
                lineTo(5.8439f, 13.8538f)
                curveTo(6.056f, 13.2176f, 6.1436f, 12.9589f, 6.2581f, 12.7187f)
                curveTo(6.3985f, 12.4241f, 6.5706f, 12.1457f, 6.7713f, 11.8883f)
                curveTo(6.9349f, 11.6785f, 7.1272f, 11.4845f, 7.6014f, 11.0102f)
                lineTo(13.4924f, 5.1193f)
                curveTo(13.7355f, 5.7293f, 14.1469f, 6.4655f, 14.8407f, 7.1593f)
                curveTo(15.5345f, 7.8531f, 16.2707f, 8.2645f, 16.8807f, 8.5076f)
                lineTo(10.9897f, 14.3986f)
                curveTo(10.5155f, 14.8728f, 10.3215f, 15.065f, 10.1117f, 15.2287f)
                curveTo(9.8543f, 15.4294f, 9.5759f, 15.6015f, 9.2813f, 15.7419f)
                curveTo(9.0411f, 15.8564f, 8.7824f, 15.944f, 8.1462f, 16.156f)
                lineTo(5.9609f, 16.8845f)
                close()
                moveTo(18.0759f, 7.3124f)
                curveTo(17.9521f, 7.2852f, 17.7973f, 7.2443f, 17.6213f, 7.1832f)
                curveTo(17.1372f, 7.0153f, 16.5006f, 6.6978f, 15.9014f, 6.0986f)
                curveTo(15.3022f, 5.4994f, 14.9847f, 4.8628f, 14.8167f, 4.3787f)
                curveTo(14.7557f, 4.2027f, 14.7148f, 4.0479f, 14.6876f, 3.924f)
                lineTo(15.1599f, 3.4518f)
                curveTo(16.0955f, 2.5161f, 17.6126f, 2.5161f, 18.5482f, 3.4518f)
                curveTo(19.4839f, 4.3874f, 19.4839f, 5.9044f, 18.5482f, 6.8401f)
                lineTo(18.0759f, 7.3124f)
                close()
                moveTo(3.25f, 22.0f)
                curveTo(3.25f, 21.5858f, 3.5858f, 21.25f, 4.0f, 21.25f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 22.75f, 3.25f, 22.4142f, 3.25f, 22.0f)
                close()
            }
        }
        .build()
        return _pen2!!
    }

private var _pen2: ImageVector? = null
