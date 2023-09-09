package com.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.MapLocationGroup

public val MapLocationGroup.PointOnMapPerspective: ImageVector
    get() {
        if (_pointOnMapPerspective != null) {
            return _pointOnMapPerspective!!
        }
        _pointOnMapPerspective = Builder(name = "PointOnMapPerspective", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0001f, 16.0f)
                curveTo(22.0001f, 13.1716f, 22.0001f, 11.7574f, 21.1214f, 10.8787f)
                curveTo(20.6315f, 10.3888f, 19.9752f, 10.172f, 19.0001f, 10.0761f)
                curveTo(18.1668f, 10.0507f, 16.2001f, 10.0f, 15.0001f, 10.0f)
                horizontalLineTo(8.0001f)
                curveTo(5.9552f, 10.0f, 4.6495f, 10.0f, 3.751f, 10.332f)
                lineTo(21.6868f, 20.1968f)
                curveTo(22.0001f, 19.3f, 22.0001f, 18.0055f, 22.0001f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7576f, 15.8979f)
                lineTo(2.5111f, 11.3623f)
                curveTo(2.0f, 12.2636f, 2.0f, 13.6392f, 2.0f, 16.0002f)
                curveTo(2.0f, 18.6659f, 2.0f, 20.0754f, 2.7356f, 20.9644f)
                lineTo(10.7576f, 15.8979f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 22.0002f)
                horizontalLineTo(16.0f)
                curveTo(18.4823f, 22.0002f, 19.8753f, 22.0002f, 20.773f, 21.4063f)
                lineTo(12.2591f, 16.7236f)
                lineTo(4.2158f, 21.8036f)
                curveTo(5.0871f, 22.0002f, 6.283f, 22.0002f, 8.0f, 22.0002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                curveTo(15.3431f, 2.0f, 14.0f, 3.3431f, 14.0f, 5.0f)
                curveTo(14.0f, 6.3979f, 14.9561f, 7.5725f, 16.25f, 7.9055f)
                lineTo(16.25f, 13.0f)
                curveTo(16.25f, 13.4142f, 16.5858f, 13.75f, 17.0f, 13.75f)
                curveTo(17.4142f, 13.75f, 17.75f, 13.4142f, 17.75f, 13.0f)
                verticalLineTo(7.9055f)
                curveTo(19.0439f, 7.5725f, 20.0f, 6.3979f, 20.0f, 5.0f)
                curveTo(20.0f, 3.3431f, 18.6569f, 2.0f, 17.0f, 2.0f)
                close()
            }
        }
        .build()
        return _pointOnMapPerspective!!
    }

private var _pointOnMapPerspective: ImageVector? = null
