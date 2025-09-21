package dev.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MedicineGroup

val MedicineGroup.JarOfPills: ImageVector
    get() {
        if (_jarOfPills != null) {
            return _jarOfPills!!
        }
        _jarOfPills = Builder(
            name = "JarOfPills", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 3.5f)
                curveTo(6.0f, 3.0341f, 6.0f, 2.8011f, 6.0761f, 2.6173f)
                curveTo(6.1776f, 2.3723f, 6.3723f, 2.1776f, 6.6173f, 2.0761f)
                curveTo(6.8011f, 2.0f, 7.0341f, 2.0f, 7.5f, 2.0f)
                horizontalLineTo(16.5f)
                curveTo(16.9659f, 2.0f, 17.1989f, 2.0f, 17.3827f, 2.0761f)
                curveTo(17.6277f, 2.1776f, 17.8224f, 2.3723f, 17.9239f, 2.6173f)
                curveTo(18.0f, 2.8011f, 18.0f, 3.0341f, 18.0f, 3.5f)
                curveTo(18.0f, 3.9659f, 18.0f, 4.1989f, 17.9239f, 4.3827f)
                curveTo(17.8224f, 4.6277f, 17.6277f, 4.8224f, 17.3827f, 4.9239f)
                curveTo(17.1989f, 5.0f, 16.9659f, 5.0f, 16.5f, 5.0f)
                horizontalLineTo(7.5f)
                curveTo(7.0341f, 5.0f, 6.8011f, 5.0f, 6.6173f, 4.9239f)
                curveTo(6.3723f, 4.8224f, 6.1776f, 4.6277f, 6.0761f, 4.3827f)
                curveTo(6.0f, 4.1989f, 6.0f, 3.9659f, 6.0f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 10.9225f)
                verticalLineTo(17.5518f)
                curveTo(4.0f, 17.7022f, 4.0085f, 17.8518f, 4.0252f, 18.0f)
                horizontalLineTo(19.9763f)
                curveTo(19.992f, 17.8561f, 20.0f, 17.7109f, 20.0f, 17.5649f)
                verticalLineTo(10.9083f)
                curveTo(20.0f, 10.5995f, 19.9643f, 10.295f, 19.8955f, 10.0f)
                horizontalLineTo(4.1078f)
                curveTo(4.0368f, 10.2994f, 4.0f, 10.6087f, 4.0f, 10.9225f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.5012f, 7.799f)
                lineTo(9.0f, 5.0f)
                horizontalLineTo(15.0182f)
                lineTo(16.1595f, 5.891f)
                lineTo(18.5168f, 7.7993f)
                curveTo(19.2149f, 8.3645f, 19.6954f, 9.1418f, 19.8955f, 10.0f)
                horizontalLineTo(4.1078f)
                curveTo(4.3116f, 9.1399f, 4.7973f, 8.3621f, 5.5012f, 7.799f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0251f, 18.0f)
                curveTo(4.1124f, 18.774f, 4.4243f, 19.5092f, 4.9271f, 20.1125f)
                curveTo(5.2927f, 20.5513f, 5.4755f, 20.7706f, 5.6773f, 20.9548f)
                curveTo(6.2761f, 21.5011f, 7.0266f, 21.8526f, 7.8295f, 21.9628f)
                curveTo(8.1002f, 22.0f, 8.3858f, 22.0f, 8.9569f, 22.0f)
                horizontalLineTo(15.6417f)
                curveTo(16.8369f, 22.0f, 17.9696f, 21.4655f, 18.7294f, 20.5428f)
                lineTo(19.0877f, 20.1078f)
                curveTo(19.5847f, 19.5043f, 19.8919f, 18.771f, 19.9762f, 18.0f)
                horizontalLineTo(4.0251f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 11.25f)
                curveTo(12.4142f, 11.25f, 12.75f, 11.5858f, 12.75f, 12.0f)
                verticalLineTo(13.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 13.25f, 14.75f, 13.5858f, 14.75f, 14.0f)
                curveTo(14.75f, 14.4142f, 14.4142f, 14.75f, 14.0f, 14.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 16.4142f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 16.4142f, 11.25f, 16.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 14.75f, 9.25f, 14.4142f, 9.25f, 14.0f)
                curveTo(9.25f, 13.5858f, 9.5858f, 13.25f, 10.0f, 13.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                close()
            }
        }
            .build()
        return _jarOfPills!!
    }

private var _jarOfPills: ImageVector? = null
