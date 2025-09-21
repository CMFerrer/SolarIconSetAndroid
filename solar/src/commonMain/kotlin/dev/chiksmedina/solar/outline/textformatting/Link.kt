package dev.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(
            name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.7284f, 3.8841f)
                curveTo(17.1627f, 2.4442f, 19.2608f, 2.414f, 20.4222f, 3.5799f)
                curveTo(21.5859f, 4.7481f, 21.5546f, 6.8593f, 20.1193f, 8.3002f)
                lineTo(17.6954f, 10.7335f)
                curveTo(17.4031f, 11.0269f, 17.404f, 11.5018f, 17.6975f, 11.7941f)
                curveTo(17.9909f, 12.0864f, 18.4658f, 12.0855f, 18.7581f, 11.7921f)
                lineTo(21.182f, 9.3588f)
                curveTo(23.0933f, 7.4401f, 23.3332f, 4.3768f, 21.485f, 2.5213f)
                curveTo(19.6345f, 0.6637f, 16.5779f, 0.9058f, 14.6657f, 2.8255f)
                lineTo(9.818f, 7.6919f)
                curveTo(7.9067f, 9.6107f, 7.6668f, 12.674f, 9.515f, 14.5295f)
                curveTo(9.8074f, 14.8229f, 10.2822f, 14.8238f, 10.5757f, 14.5315f)
                curveTo(10.8692f, 14.2392f, 10.8701f, 13.7643f, 10.5777f, 13.4709f)
                curveTo(9.4141f, 12.3027f, 9.4454f, 10.1914f, 10.8807f, 8.7505f)
                lineTo(15.7284f, 3.8841f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.4849f, 9.4709f)
                curveTo(14.1926f, 9.1774f, 13.7177f, 9.1765f, 13.4243f, 9.4688f)
                curveTo(13.1308f, 9.7611f, 13.1299f, 10.236f, 13.4222f, 10.5295f)
                curveTo(14.5859f, 11.6976f, 14.5546f, 13.8089f, 13.1192f, 15.2497f)
                lineTo(8.2716f, 20.1162f)
                curveTo(6.8373f, 21.5561f, 4.7392f, 21.5864f, 3.5777f, 20.4204f)
                curveTo(2.4141f, 19.2522f, 2.4454f, 17.1409f, 3.8807f, 15.7001f)
                lineTo(6.3046f, 13.2668f)
                curveTo(6.5969f, 12.9733f, 6.596f, 12.4985f, 6.3025f, 12.2062f)
                curveTo(6.0091f, 11.9138f, 5.5342f, 11.9147f, 5.2419f, 12.2082f)
                lineTo(2.818f, 14.6415f)
                curveTo(0.9067f, 16.5602f, 0.6668f, 19.6235f, 2.515f, 21.479f)
                curveTo(4.3655f, 23.3367f, 7.4221f, 23.0945f, 9.3343f, 21.1748f)
                lineTo(14.182f, 16.3083f)
                curveTo(16.0933f, 14.3896f, 16.3332f, 11.3263f, 14.4849f, 9.4709f)
                close()
            }
        }
            .build()
        return _link!!
    }

private var _link: ImageVector? = null
