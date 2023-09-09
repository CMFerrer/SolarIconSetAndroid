package com.chiksmedina.solar.bold.medicine

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
import com.chiksmedina.solar.bold.MedicineGroup

public val MedicineGroup.JarOfPills: ImageVector
    get() {
        if (_jarOfPills != null) {
            return _jarOfPills!!
        }
        _jarOfPills = Builder(name = "JarOfPills", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0761f, 2.6173f)
                curveTo(6.0f, 2.8011f, 6.0f, 3.0341f, 6.0f, 3.5f)
                curveTo(6.0f, 3.9659f, 6.0f, 4.1989f, 6.0761f, 4.3827f)
                curveTo(6.1776f, 4.6277f, 6.3723f, 4.8224f, 6.6173f, 4.9239f)
                curveTo(6.8011f, 5.0f, 7.0341f, 5.0f, 7.5f, 5.0f)
                horizontalLineTo(9.0f)
                horizontalLineTo(15.0f)
                horizontalLineTo(16.5f)
                curveTo(16.9659f, 5.0f, 17.1989f, 5.0f, 17.3827f, 4.9239f)
                curveTo(17.6277f, 4.8224f, 17.8224f, 4.6277f, 17.9239f, 4.3827f)
                curveTo(18.0f, 4.1989f, 18.0f, 3.9659f, 18.0f, 3.5f)
                curveTo(18.0f, 3.0341f, 18.0f, 2.8011f, 17.9239f, 2.6173f)
                curveTo(17.8224f, 2.3723f, 17.6277f, 2.1776f, 17.3827f, 2.0761f)
                curveTo(17.1989f, 2.0f, 16.9659f, 2.0f, 16.5f, 2.0f)
                horizontalLineTo(7.5f)
                curveTo(7.0341f, 2.0f, 6.8011f, 2.0f, 6.6173f, 2.0761f)
                curveTo(6.3723f, 2.1776f, 6.1776f, 2.3723f, 6.0761f, 2.6173f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 6.0f)
                lineTo(5.5012f, 7.799f)
                curveTo(5.009f, 8.1927f, 4.6235f, 8.6915f, 4.3664f, 9.2499f)
                horizontalLineTo(19.6401f)
                curveTo(19.3862f, 8.6927f, 19.0046f, 8.1942f, 18.5168f, 7.7993f)
                lineTo(16.2942f, 6.0f)
                horizontalLineTo(7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 10.9082f)
                curveTo(20.0f, 10.8553f, 19.999f, 10.8026f, 19.9969f, 10.7499f)
                horizontalLineTo(4.0037f)
                curveTo(4.0012f, 10.8073f, 4.0f, 10.8648f, 4.0f, 10.9224f)
                verticalLineTo(17.2499f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.9082f)
                close()
                moveTo(12.75f, 13.2499f)
                verticalLineTo(11.9999f)
                curveTo(12.75f, 11.5857f, 12.4142f, 11.2499f, 12.0f, 11.2499f)
                curveTo(11.5858f, 11.2499f, 11.25f, 11.5857f, 11.25f, 11.9999f)
                verticalLineTo(13.2499f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 13.2499f, 9.25f, 13.5857f, 9.25f, 13.9999f)
                curveTo(9.25f, 14.4141f, 9.5858f, 14.7499f, 10.0f, 14.7499f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.9999f)
                curveTo(11.25f, 16.4141f, 11.5858f, 16.7499f, 12.0f, 16.7499f)
                curveTo(12.4142f, 16.7499f, 12.75f, 16.4141f, 12.75f, 15.9999f)
                verticalLineTo(14.7499f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 14.7499f, 14.75f, 14.4141f, 14.75f, 13.9999f)
                curveTo(14.75f, 13.5857f, 14.4142f, 13.2499f, 14.0f, 13.2499f)
                horizontalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9271f, 20.1125f)
                curveTo(4.5902f, 19.7082f, 4.339f, 19.2447f, 4.1837f, 18.7499f)
                horizontalLineTo(19.8204f)
                curveTo(19.6677f, 19.2422f, 19.4202f, 19.704f, 19.0877f, 20.1077f)
                lineTo(18.7294f, 20.5428f)
                curveTo(17.9696f, 21.4654f, 16.837f, 21.9999f, 15.6417f, 21.9999f)
                horizontalLineTo(8.9569f)
                curveTo(8.3858f, 21.9999f, 8.1003f, 21.9999f, 7.8296f, 21.9628f)
                curveTo(7.0266f, 21.8526f, 6.2761f, 21.501f, 5.6774f, 20.9548f)
                curveTo(5.4755f, 20.7706f, 5.2927f, 20.5512f, 4.9271f, 20.1125f)
                close()
            }
        }
        .build()
        return _jarOfPills!!
    }

private var _jarOfPills: ImageVector? = null
