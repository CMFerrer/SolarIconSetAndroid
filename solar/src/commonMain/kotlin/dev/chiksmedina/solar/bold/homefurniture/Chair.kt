package dev.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.HomeFurnitureGroup

val HomeFurnitureGroup.Chair: ImageVector
    get() {
        if (_chair != null) {
            return _chair!!
        }
        _chair = Builder(
            name = "Chair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.4019f, 4.5f)
                curveTo(7.0f, 5.1961f, 7.0f, 6.1308f, 7.0f, 8.0f)
                verticalLineTo(11.0269f)
                curveTo(7.4303f, 10.9999f, 7.914f, 11.0f, 8.4348f, 11.0f)
                horizontalLineTo(15.5648f)
                curveTo(16.0858f, 11.0f, 16.5696f, 10.9999f, 17.0f, 11.0269f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 6.1308f, 17.0f, 5.1961f, 16.5981f, 4.5f)
                curveTo(16.3348f, 4.0439f, 15.9561f, 3.6652f, 15.5f, 3.4019f)
                curveTo(14.8038f, 3.0f, 13.8692f, 3.0f, 12.0f, 3.0f)
                curveTo(10.1308f, 3.0f, 9.1961f, 3.0f, 8.5f, 3.4019f)
                curveTo(8.0439f, 3.6652f, 7.6652f, 4.0439f, 7.4019f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.25f, 15.9914f)
                curveTo(5.748f, 15.9711f, 5.4441f, 15.9032f, 5.236f, 15.6762f)
                curveTo(4.9393f, 15.3523f, 4.9779f, 14.9018f, 5.0553f, 14.0008f)
                curveTo(5.1111f, 13.3503f, 5.2373f, 12.9125f, 5.5227f, 12.5858f)
                curveTo(6.0345f, 12.0f, 6.8582f, 12.0f, 8.5055f, 12.0f)
                horizontalLineTo(15.4945f)
                curveTo(17.1418f, 12.0f, 17.9655f, 12.0f, 18.4773f, 12.5858f)
                curveTo(18.7627f, 12.9125f, 18.8889f, 13.3503f, 18.9448f, 14.0008f)
                curveTo(19.0221f, 14.9018f, 19.0607f, 15.3523f, 18.764f, 15.6762f)
                curveTo(18.5559f, 15.9032f, 18.252f, 15.9711f, 17.75f, 15.9914f)
                verticalLineTo(20.9999f)
                curveTo(17.75f, 21.4142f, 17.4142f, 21.7499f, 17.0f, 21.7499f)
                curveTo(16.5858f, 21.7499f, 16.25f, 21.4142f, 16.25f, 20.9999f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.75f)
                verticalLineTo(20.9999f)
                curveTo(7.75f, 21.4142f, 7.4142f, 21.7499f, 7.0f, 21.7499f)
                curveTo(6.5858f, 21.7499f, 6.25f, 21.4142f, 6.25f, 20.9999f)
                verticalLineTo(15.9914f)
                close()
            }
        }
            .build()
        return _chair!!
    }

private var _chair: ImageVector? = null
