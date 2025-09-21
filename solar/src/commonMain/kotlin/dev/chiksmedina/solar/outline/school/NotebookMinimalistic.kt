package dev.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.NotebookMinimalistic: ImageVector
    get() {
        if (_notebookMinimalistic != null) {
            return _notebookMinimalistic!!
        }
        _notebookMinimalistic = Builder(
            name = "NotebookMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.75f, 4.9332f)
                curveTo(22.75f, 3.4699f, 21.5847f, 2.215f, 20.0559f, 2.2682f)
                curveTo(18.9175f, 2.3079f, 17.4296f, 2.4263f, 16.2849f, 2.769f)
                curveTo(15.2899f, 3.0669f, 14.1706f, 3.6487f, 13.2982f, 4.1537f)
                curveTo(12.4801f, 4.6271f, 11.4617f, 4.6507f, 10.6328f, 4.2125f)
                curveTo(9.6374f, 3.6861f, 8.3277f, 3.0622f, 7.1914f, 2.7623f)
                curveTo(6.2305f, 2.5088f, 5.0152f, 2.387f, 4.0284f, 2.3263f)
                curveTo(2.4702f, 2.2306f, 1.25f, 3.4987f, 1.25f, 4.9978f)
                verticalLineTo(16.1436f)
                curveTo(1.25f, 17.6798f, 2.4938f, 18.8792f, 3.968f, 18.9714f)
                curveTo(4.9268f, 19.0314f, 6.0057f, 19.1467f, 6.8086f, 19.3586f)
                curveTo(7.8012f, 19.6205f, 9.0286f, 20.2029f, 10.0196f, 20.7311f)
                curveTo(11.2529f, 21.3885f, 12.7471f, 21.3885f, 13.9804f, 20.7311f)
                curveTo(14.9714f, 20.2029f, 16.1988f, 19.6205f, 17.1914f, 19.3586f)
                curveTo(17.9943f, 19.1467f, 19.0732f, 19.0314f, 20.032f, 18.9714f)
                curveTo(21.5062f, 18.8792f, 22.75f, 17.6798f, 22.75f, 16.1436f)
                verticalLineTo(4.9332f)
                close()
                moveTo(20.1081f, 3.7673f)
                curveTo(20.7229f, 3.7459f, 21.25f, 4.2516f, 21.25f, 4.9332f)
                verticalLineTo(16.1436f)
                curveTo(21.25f, 16.8294f, 20.6817f, 17.4278f, 19.9383f, 17.4743f)
                curveTo(18.9582f, 17.5356f, 17.7591f, 17.6574f, 16.8086f, 17.9082f)
                curveTo(15.6383f, 18.2171f, 14.2827f, 18.8701f, 13.2748f, 19.4074f)
                curveTo(13.1065f, 19.4971f, 12.9305f, 19.5678f, 12.75f, 19.6194f)
                verticalLineTo(5.9421f)
                curveTo(13.2023f, 5.8515f, 13.6421f, 5.6877f, 14.0495f, 5.4519f)
                curveTo(14.9f, 4.9597f, 15.8949f, 4.4515f, 16.7151f, 4.206f)
                curveTo(17.6643f, 3.9218f, 18.9892f, 3.8063f, 20.1081f, 3.7673f)
                close()
                moveTo(11.25f, 5.975f)
                curveTo(10.795f, 5.9043f, 10.349f, 5.7592f, 9.9317f, 5.5385f)
                curveTo(8.9549f, 5.022f, 7.7708f, 4.4665f, 6.8086f, 4.2127f)
                curveTo(5.9964f, 3.9983f, 4.9024f, 3.8829f, 3.9364f, 3.8235f)
                curveTo(3.3024f, 3.7845f, 2.75f, 4.3007f, 2.75f, 4.9978f)
                verticalLineTo(16.1436f)
                curveTo(2.75f, 16.8294f, 3.3183f, 17.4278f, 4.0617f, 17.4743f)
                curveTo(5.0418f, 17.5356f, 6.2409f, 17.6574f, 7.1914f, 17.9082f)
                curveTo(8.3617f, 18.2171f, 9.7173f, 18.8701f, 10.7252f, 19.4074f)
                curveTo(10.8935f, 19.4971f, 11.0695f, 19.5678f, 11.25f, 19.6194f)
                verticalLineTo(5.975f)
                close()
            }
        }
            .build()
        return _notebookMinimalistic!!
    }

private var _notebookMinimalistic: ImageVector? = null
