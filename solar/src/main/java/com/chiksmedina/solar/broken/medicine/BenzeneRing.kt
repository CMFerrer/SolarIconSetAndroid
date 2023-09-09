package com.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MedicineGroup

public val MedicineGroup.BenzeneRing: ImageVector
    get() {
        if (_benzeneRing != null) {
            return _benzeneRing!!
        }
        _benzeneRing = Builder(name = "BenzeneRing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0207f, 6.6379f)
                curveTo(6.0345f, 7.2241f, 5.5415f, 7.5172f, 5.2707f, 8.0f)
                curveTo(5.0f, 8.4828f, 5.0f, 9.069f, 5.0f, 10.2414f)
                verticalLineTo(13.7586f)
                curveTo(5.0f, 14.931f, 5.0f, 15.5172f, 5.2707f, 16.0f)
                curveTo(5.5415f, 16.4828f, 6.0345f, 16.7759f, 7.0207f, 17.3621f)
                lineTo(9.9793f, 19.1207f)
                curveTo(10.9655f, 19.7069f, 11.4585f, 20.0f, 12.0f, 20.0f)
                curveTo(12.5415f, 20.0f, 13.0345f, 19.7069f, 14.0207f, 19.1207f)
                lineTo(16.9793f, 17.3621f)
                curveTo(17.9655f, 16.7759f, 18.4585f, 16.4828f, 18.7293f, 16.0f)
                curveTo(18.9807f, 15.5516f, 18.9986f, 15.0139f, 18.9999f, 14.0f)
                moveTo(9.9793f, 4.8793f)
                curveTo(10.9655f, 4.2931f, 11.4585f, 4.0f, 12.0f, 4.0f)
                curveTo(12.5415f, 4.0f, 13.0345f, 4.2931f, 14.0207f, 4.8793f)
                lineTo(16.9793f, 6.6379f)
                curveTo(17.9655f, 7.2241f, 18.4585f, 7.5172f, 18.7293f, 8.0f)
                curveTo(18.9808f, 8.4485f, 18.9986f, 8.9861f, 18.9999f, 10.0001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                lineTo(2.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                lineTo(22.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 16.0f)
                lineTo(2.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.8841f)
                lineTo(16.0f, 14.5f)
            }
        }
        .build()
        return _benzeneRing!!
    }

private var _benzeneRing: ImageVector? = null
