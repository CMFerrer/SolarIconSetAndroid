package dev.chiksmedina.solar.lineduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.SportsGroup

val SportsGroup.Tennis2: ImageVector
    get() {
        if (_tennis2 != null) {
            return _tennis2!!
        }
        _tennis2 = Builder(
            name = "Tennis2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.3397f, 17.0002f)
                curveTo(6.1011f, 21.7831f, 12.217f, 23.4219f, 17.0f, 20.6605f)
                curveTo(18.9496f, 19.5349f, 20.3768f, 17.8519f, 21.1965f, 15.929f)
                curveTo(22.3878f, 13.1346f, 22.296f, 9.8335f, 20.6602f, 7.0002f)
                curveTo(19.0244f, 4.1669f, 16.2114f, 2.4369f, 13.1957f, 2.0714f)
                curveTo(11.1207f, 1.8198f, 8.9496f, 2.2143f, 7.0f, 3.34f)
                curveTo(2.217f, 6.1014f, 0.5783f, 12.2173f, 3.3397f, 17.0002f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.1958f, 2.0713f)
                curveTo(13.1958f, 2.0713f, 12.0981f, 6.17f, 14.5981f, 10.5001f)
                curveTo(17.0981f, 14.8303f, 21.1965f, 15.929f, 21.1965f, 15.929f)
                moveTo(2.8035f, 8.0713f)
                curveTo(2.8035f, 8.0713f, 6.9019f, 9.17f, 9.4019f, 13.5001f)
                curveTo(11.9019f, 17.8303f, 10.8042f, 21.929f, 10.8042f, 21.929f)
            }
        }
            .build()
        return _tennis2!!
    }

private var _tennis2: ImageVector? = null
