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

val MessagesConversationGroup.CheckRead: ImageVector
    get() {
        if (_checkRead != null) {
            return _checkRead!!
        }
        _checkRead = Builder(
            name = "CheckRead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.4933f, 6.935f)
                curveTo(15.8053f, 7.2074f, 15.8374f, 7.6812f, 15.565f, 7.9932f)
                lineTo(7.7079f, 16.9933f)
                curveTo(7.5654f, 17.1564f, 7.3594f, 17.25f, 7.1429f, 17.25f)
                curveTo(6.9263f, 17.25f, 6.7203f, 17.1564f, 6.5779f, 16.9933f)
                lineTo(3.435f, 13.3933f)
                curveTo(3.1626f, 13.0812f, 3.1947f, 12.6074f, 3.5068f, 12.335f)
                curveTo(3.8188f, 12.0626f, 4.2926f, 12.0947f, 4.565f, 12.4068f)
                lineTo(7.1429f, 15.3596f)
                lineTo(14.435f, 7.0068f)
                curveTo(14.7074f, 6.6947f, 15.1812f, 6.6626f, 15.4933f, 6.935f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.5175f, 7.0195f)
                curveTo(20.8174f, 7.3051f, 20.829f, 7.7799f, 20.5433f, 8.0798f)
                lineTo(11.9716f, 17.0798f)
                curveTo(11.8201f, 17.2389f, 11.6065f, 17.3235f, 11.3872f, 17.3114f)
                curveTo(11.1679f, 17.2993f, 10.9649f, 17.1917f, 10.8318f, 17.0169f)
                lineTo(10.4035f, 16.4544f)
                curveTo(10.1526f, 16.1249f, 10.2163f, 15.6543f, 10.5458f, 15.4034f)
                curveTo(10.8289f, 15.1878f, 11.2161f, 15.2044f, 11.4787f, 15.4223f)
                lineTo(19.4571f, 7.0453f)
                curveTo(19.7428f, 6.7454f, 20.2175f, 6.7338f, 20.5175f, 7.0195f)
                close()
            }
        }
            .build()
        return _checkRead!!
    }

private var _checkRead: ImageVector? = null
