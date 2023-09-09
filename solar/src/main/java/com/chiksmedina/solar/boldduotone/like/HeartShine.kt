package com.chiksmedina.solar.boldduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.LikeGroup

public val LikeGroup.HeartShine: ImageVector
    get() {
        if (_heartShine != null) {
            return _heartShine!!
        }
        _heartShine = Builder(name = "HeartShine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.8f, strokeAlpha
                    = 0.8f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(12.75f, 4.4142f, 12.4142f, 4.75f, 12.0f, 4.75f)
                curveTo(11.5858f, 4.75f, 11.25f, 4.4142f, 11.25f, 4.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 11.25f, 4.75f, 11.5858f, 4.75f, 12.0f)
                curveTo(4.75f, 12.4142f, 4.4142f, 12.75f, 4.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(19.25f, 12.0f)
                curveTo(19.25f, 11.5858f, 19.5858f, 11.25f, 20.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(20.0f)
                curveTo(19.5858f, 12.75f, 19.25f, 12.4142f, 19.25f, 12.0f)
                close()
                moveTo(12.0f, 19.25f)
                curveTo(12.4142f, 19.25f, 12.75f, 19.5858f, 12.75f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(11.25f, 19.5858f, 11.5858f, 19.25f, 12.0f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4697f, 5.4697f)
                curveTo(5.7626f, 5.1768f, 6.2374f, 5.1768f, 6.5303f, 5.4697f)
                lineTo(6.8736f, 5.8129f)
                curveTo(7.1665f, 6.1058f, 7.1665f, 6.5807f, 6.8736f, 6.8736f)
                curveTo(6.5807f, 7.1665f, 6.1058f, 7.1665f, 5.8129f, 6.8736f)
                lineTo(5.4697f, 6.5303f)
                curveTo(5.1768f, 6.2374f, 5.1768f, 5.7626f, 5.4697f, 5.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5303f, 5.4697f)
                curveTo(18.8232f, 5.7626f, 18.8232f, 6.2374f, 18.5303f, 6.5303f)
                lineTo(18.1871f, 6.8736f)
                curveTo(17.8942f, 7.1665f, 17.4193f, 7.1665f, 17.1264f, 6.8736f)
                curveTo(16.8335f, 6.5807f, 16.8335f, 6.1058f, 17.1264f, 5.8129f)
                lineTo(17.4697f, 5.4697f)
                curveTo(17.7626f, 5.1768f, 18.2374f, 5.1768f, 18.5303f, 5.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8734f, 17.1266f)
                curveTo(7.1663f, 17.4195f, 7.1663f, 17.8944f, 6.8734f, 18.1873f)
                lineTo(6.5303f, 18.5303f)
                curveTo(6.2374f, 18.8232f, 5.7626f, 18.8232f, 5.4697f, 18.5303f)
                curveTo(5.1768f, 18.2374f, 5.1768f, 17.7626f, 5.4697f, 17.4697f)
                lineTo(5.8127f, 17.1266f)
                curveTo(6.1056f, 16.8337f, 6.5805f, 16.8337f, 6.8734f, 17.1266f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.1266f, 17.1266f)
                curveTo(17.4195f, 16.8337f, 17.8944f, 16.8337f, 18.1873f, 17.1266f)
                lineTo(18.5303f, 17.4697f)
                curveTo(18.8232f, 17.7626f, 18.8232f, 18.2374f, 18.5303f, 18.5303f)
                curveTo(18.2374f, 18.8232f, 17.7626f, 18.8232f, 17.4697f, 18.5303f)
                lineTo(17.1266f, 18.1873f)
                curveTo(16.8337f, 17.8944f, 16.8337f, 17.4195f, 17.1266f, 17.1266f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0595f)
                curveTo(7.0f, 13.6018f, 9.0097f, 14.9566f, 10.4809f, 16.1692f)
                curveTo(11.0f, 16.5971f, 11.5f, 17.0f, 12.0f, 17.0f)
                curveTo(12.5f, 17.0f, 13.0f, 16.5971f, 13.5191f, 16.1692f)
                curveTo(14.9903f, 14.9566f, 17.0f, 13.6018f, 17.0f, 11.0595f)
                curveTo(17.0f, 8.5172f, 14.2499f, 6.7142f, 12.0f, 9.1584f)
                curveTo(9.7501f, 6.7142f, 7.0f, 8.5172f, 7.0f, 11.0595f)
                close()
            }
        }
        .build()
        return _heartShine!!
    }

private var _heartShine: ImageVector? = null
