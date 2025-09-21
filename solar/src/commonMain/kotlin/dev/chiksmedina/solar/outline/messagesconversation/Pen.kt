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

val MessagesConversationGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(
            name = "Pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.7566f, 2.6214f)
                curveTo(16.5852f, 0.7929f, 19.5499f, 0.7929f, 21.3785f, 2.6214f)
                curveTo(23.2071f, 4.45f, 23.2071f, 7.4148f, 21.3785f, 9.2434f)
                lineTo(11.8932f, 18.7287f)
                curveTo(11.3513f, 19.2706f, 11.0323f, 19.5897f, 10.6774f, 19.8665f)
                curveTo(10.2591f, 20.1927f, 9.8065f, 20.4725f, 9.3276f, 20.7007f)
                curveTo(8.9213f, 20.8943f, 8.4933f, 21.037f, 7.7662f, 21.2793f)
                lineTo(4.4351f, 22.3897f)
                lineTo(3.633f, 22.6571f)
                curveTo(2.9824f, 22.8739f, 2.2652f, 22.7046f, 1.7803f, 22.2197f)
                curveTo(1.2954f, 21.7348f, 1.1261f, 21.0175f, 1.3429f, 20.367f)
                lineTo(2.7206f, 16.2338f)
                curveTo(2.963f, 15.5067f, 3.1056f, 15.0787f, 3.2993f, 14.6724f)
                curveTo(3.5275f, 14.1935f, 3.8072f, 13.7409f, 4.1335f, 13.3226f)
                curveTo(4.4103f, 12.9677f, 4.7294f, 12.6487f, 5.2713f, 12.1067f)
                lineTo(14.7566f, 2.6214f)
                close()
                moveTo(4.4005f, 20.8201f)
                lineTo(7.242f, 19.8729f)
                curveTo(8.0331f, 19.6092f, 8.3692f, 19.4958f, 8.6823f, 19.3466f)
                curveTo(9.0628f, 19.1653f, 9.4225f, 18.943f, 9.7549f, 18.6837f)
                curveTo(10.0283f, 18.4704f, 10.2801f, 18.2205f, 10.8698f, 17.6308f)
                lineTo(18.4392f, 10.0614f)
                curveTo(17.6506f, 9.7832f, 16.6346f, 9.2676f, 15.6835f, 8.3165f)
                curveTo(14.7324f, 7.3654f, 14.2168f, 6.3494f, 13.9386f, 5.5608f)
                lineTo(6.3691f, 13.1302f)
                curveTo(5.7795f, 13.7199f, 5.5296f, 13.9716f, 5.3163f, 14.2451f)
                curveTo(5.057f, 14.5775f, 4.8347f, 14.9371f, 4.6534f, 15.3177f)
                curveTo(4.5042f, 15.6307f, 4.3908f, 15.9669f, 4.1271f, 16.758f)
                lineTo(3.1799f, 19.5995f)
                lineTo(4.4005f, 20.8201f)
                close()
                moveTo(15.1553f, 4.344f)
                curveTo(15.1895f, 4.519f, 15.2473f, 4.7568f, 15.3438f, 5.0349f)
                curveTo(15.561f, 5.6608f, 15.9712f, 6.4829f, 16.7441f, 7.2558f)
                curveTo(17.5171f, 8.0288f, 18.3392f, 8.439f, 18.9651f, 8.6562f)
                curveTo(19.2431f, 8.7527f, 19.481f, 8.8105f, 19.6559f, 8.8447f)
                lineTo(20.3179f, 8.1827f)
                curveTo(21.5607f, 6.9399f, 21.5607f, 4.9249f, 20.3179f, 3.6821f)
                curveTo(19.0751f, 2.4393f, 17.0601f, 2.4393f, 15.8173f, 3.6821f)
                lineTo(15.1553f, 4.344f)
                close()
            }
        }
            .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
