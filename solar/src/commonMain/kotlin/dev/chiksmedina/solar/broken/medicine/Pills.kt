package dev.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MedicineGroup

val MedicineGroup.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(
            name = "Pills", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.8445f, 6.1555f)
                curveTo(17.8445f, 6.1555f, 17.4119f, 8.4f, 14.9057f, 10.9061f)
                curveTo(12.3996f, 13.4123f, 10.1555f, 13.8445f, 10.1555f, 13.8445f)
                moveTo(21.7828f, 11.038f)
                curveTo(21.5355f, 10.1888f, 21.0771f, 9.3881f, 20.4075f, 8.7185f)
                lineTo(15.2815f, 3.5925f)
                curveTo(13.1582f, 1.4692f, 9.7157f, 1.4692f, 7.5925f, 3.5925f)
                curveTo(5.4692f, 5.7157f, 5.4692f, 9.1582f, 7.5925f, 11.2815f)
                lineTo(12.7185f, 16.4075f)
                curveTo(14.8418f, 18.5308f, 18.2843f, 18.5308f, 20.4075f, 16.4075f)
                curveTo(20.8312f, 15.9839f, 21.1703f, 15.5077f, 21.4249f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 6.5f)
                lineTo(13.0f, 5.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.8882f, 10.8678f)
                curveTo(7.2931f, 10.7806f, 7.5506f, 10.3816f, 7.4634f, 9.9767f)
                curveTo(7.3762f, 9.5717f, 6.9772f, 9.3142f, 6.5722f, 9.4015f)
                lineTo(6.8882f, 10.8678f)
                close()
                moveTo(5.8128f, 20.7743f)
                curveTo(5.4364f, 20.6016f, 4.9911f, 20.7667f, 4.8184f, 21.1431f)
                curveTo(4.6456f, 21.5196f, 4.8107f, 21.9648f, 5.1872f, 22.1376f)
                lineTo(5.8128f, 20.7743f)
                close()
                moveTo(1.8625f, 18.813f)
                curveTo(2.0352f, 19.1894f, 2.4805f, 19.3545f, 2.857f, 19.1818f)
                curveTo(3.2334f, 19.009f, 3.3985f, 18.5637f, 3.2257f, 18.1873f)
                lineTo(1.8625f, 18.813f)
                close()
                moveTo(2.75f, 16.0f)
                curveTo(2.75f, 13.4826f, 4.5225f, 11.3775f, 6.8882f, 10.8678f)
                lineTo(6.5722f, 9.4015f)
                curveTo(3.5302f, 10.0569f, 1.25f, 12.7613f, 1.25f, 16.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(13.139f, 17.0796f)
                curveTo(12.6416f, 19.4613f, 10.5288f, 21.25f, 8.0f, 21.25f)
                verticalLineTo(22.75f)
                curveTo(11.2534f, 22.75f, 13.9676f, 20.4491f, 14.6074f, 17.3863f)
                lineTo(13.139f, 17.0796f)
                close()
                moveTo(8.0f, 21.25f)
                curveTo(7.2179f, 21.25f, 6.4777f, 21.0795f, 5.8128f, 20.7743f)
                lineTo(5.1872f, 22.1376f)
                curveTo(6.0444f, 22.531f, 6.9976f, 22.75f, 8.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(3.2257f, 18.1873f)
                curveTo(2.9205f, 17.5223f, 2.75f, 16.7821f, 2.75f, 16.0f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 17.0024f, 1.469f, 17.9557f, 1.8625f, 18.813f)
                lineTo(3.2257f, 18.1873f)
                close()
            }
        }
            .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
