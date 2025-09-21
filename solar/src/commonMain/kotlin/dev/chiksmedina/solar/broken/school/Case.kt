package dev.chiksmedina.solar.broken.school

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
import dev.chiksmedina.solar.broken.SchoolGroup

val SchoolGroup.Case: ImageVector
    get() {
        if (_case != null) {
            return _case!!
        }
        _case = Builder(
            name = "Case", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 21.25f)
                curveTo(11.5858f, 21.25f, 11.25f, 21.5858f, 11.25f, 22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(4.318f, 20.8284f)
                lineTo(4.8163f, 20.2679f)
                lineTo(4.318f, 20.8284f)
                close()
                moveTo(19.682f, 20.8284f)
                lineTo(19.1837f, 20.2679f)
                lineTo(19.1837f, 20.2679f)
                lineTo(19.682f, 20.8284f)
                close()
                moveTo(7.9548f, 22.6837f)
                curveTo(8.3682f, 22.7087f, 8.7236f, 22.3938f, 8.7486f, 21.9804f)
                curveTo(8.7736f, 21.5669f, 8.4587f, 21.2115f, 8.0452f, 21.1865f)
                lineTo(7.9548f, 22.6837f)
                close()
                moveTo(2.25f, 12.0f)
                curveTo(2.25f, 13.8741f, 2.2492f, 15.8307f, 2.4188f, 17.4664f)
                curveTo(2.5037f, 18.2856f, 2.634f, 19.0548f, 2.8407f, 19.7105f)
                curveTo(3.0441f, 20.3557f, 3.3444f, 20.9665f, 3.8198f, 21.389f)
                lineTo(4.8163f, 20.2679f)
                curveTo(4.6326f, 20.1046f, 4.4387f, 19.7904f, 4.2713f, 19.2596f)
                curveTo(4.1074f, 18.7394f, 3.9906f, 18.0818f, 3.9107f, 17.3118f)
                curveTo(3.7508f, 15.769f, 3.75f, 13.8971f, 3.75f, 12.0f)
                horizontalLineTo(2.25f)
                close()
                moveTo(12.0f, 22.75f)
                curveTo(14.1024f, 22.75f, 15.7464f, 22.7513f, 17.0267f, 22.5983f)
                curveTo(18.3204f, 22.4436f, 19.3568f, 22.1209f, 20.1803f, 21.389f)
                lineTo(19.1837f, 20.2679f)
                curveTo(18.6891f, 20.7075f, 18.0058f, 20.9706f, 16.8487f, 21.1089f)
                curveTo(15.6782f, 21.2487f, 14.1402f, 21.25f, 12.0f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(8.0452f, 21.1865f)
                curveTo(6.331f, 21.0829f, 5.4315f, 20.8147f, 4.8163f, 20.2679f)
                lineTo(3.8198f, 21.389f)
                curveTo(4.8358f, 22.2921f, 6.1827f, 22.5767f, 7.9548f, 22.6837f)
                lineTo(8.0452f, 21.1865f)
                close()
                moveTo(20.2499f, 12.3873f)
                curveTo(20.2492f, 14.2185f, 20.2371f, 16.0032f, 20.0724f, 17.4673f)
                curveTo(19.9902f, 18.1982f, 19.8728f, 18.8201f, 19.7119f, 19.3117f)
                curveTo(19.548f, 19.8126f, 19.3605f, 20.1108f, 19.1837f, 20.2679f)
                lineTo(20.1803f, 21.389f)
                curveTo(20.6399f, 20.9804f, 20.9352f, 20.3963f, 21.1375f, 19.7783f)
                curveTo(21.3428f, 19.1509f, 21.4751f, 18.4171f, 21.563f, 17.635f)
                curveTo(21.7387f, 16.0731f, 21.7492f, 14.2032f, 21.7499f, 12.3879f)
                lineTo(20.2499f, 12.3873f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.6603f, 14.2019f)
                lineTo(17.664f, 13.3008f)
                moveTo(9.3397f, 14.2019f)
                lineTo(3.3324f, 12.3997f)
                curveTo(2.7369f, 12.2211f, 2.4392f, 12.1317f, 2.2502f, 11.9176f)
                curveTo(2.2134f, 11.8759f, 2.1802f, 11.8312f, 2.1508f, 11.784f)
                curveTo(2.0f, 11.5415f, 2.0f, 11.2307f, 2.0f, 10.6089f)
                curveTo(2.0f, 8.1588f, 2.0f, 6.9337f, 2.673f, 6.1066f)
                curveTo(2.8023f, 5.9476f, 2.9476f, 5.8023f, 3.1066f, 5.673f)
                curveTo(3.9337f, 5.0f, 5.1588f, 5.0f, 7.6089f, 5.0f)
                horizontalLineTo(16.3911f)
                curveTo(18.8412f, 5.0f, 20.0663f, 5.0f, 20.8934f, 5.673f)
                curveTo(21.0524f, 5.8023f, 21.1977f, 5.9476f, 21.327f, 6.1066f)
                curveTo(22.0f, 6.9337f, 22.0f, 8.1588f, 22.0f, 10.6089f)
                curveTo(22.0f, 11.2307f, 22.0f, 11.5415f, 21.8492f, 11.784f)
                curveTo(21.8199f, 11.8312f, 21.7866f, 11.8759f, 21.7498f, 11.9176f)
                curveTo(21.5999f, 12.0875f, 21.3814f, 12.1789f, 21.0f, 12.2986f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.5f, 5.0f)
                curveTo(7.3234f, 4.9791f, 8.1593f, 4.4549f, 8.4394f, 3.6803f)
                curveTo(8.4481f, 3.6565f, 8.4569f, 3.63f, 8.4746f, 3.577f)
                lineTo(8.5002f, 3.5f)
                curveTo(8.5424f, 3.3734f, 8.5635f, 3.3101f, 8.5861f, 3.254f)
                curveTo(8.8743f, 2.5371f, 9.5496f, 2.0504f, 10.3208f, 2.0037f)
                curveTo(10.3812f, 2.0f, 10.4479f, 2.0f, 10.5814f, 2.0f)
                horizontalLineTo(13.4191f)
                curveTo(13.5525f, 2.0f, 13.6192f, 2.0f, 13.6796f, 2.0037f)
                curveTo(14.4508f, 2.0504f, 15.1262f, 2.5371f, 15.4144f, 3.254f)
                curveTo(15.4369f, 3.3101f, 15.458f, 3.3734f, 15.5002f, 3.5f)
                lineTo(15.5259f, 3.577f)
                curveTo(15.5435f, 3.6297f, 15.5524f, 3.6566f, 15.561f, 3.6803f)
                curveTo(15.8412f, 4.4549f, 16.6766f, 4.9791f, 17.5f, 5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 12.5f)
                horizontalLineTo(10.0f)
                curveTo(9.7239f, 12.5f, 9.5f, 12.7239f, 9.5f, 13.0f)
                verticalLineTo(15.1615f)
                curveTo(9.5f, 15.3659f, 9.6245f, 15.5498f, 9.8143f, 15.6257f)
                lineTo(10.5144f, 15.9058f)
                curveTo(11.4681f, 16.2872f, 12.5319f, 16.2872f, 13.4856f, 15.9058f)
                lineTo(14.1857f, 15.6257f)
                curveTo(14.3755f, 15.5498f, 14.5f, 15.3659f, 14.5f, 15.1615f)
                verticalLineTo(13.0f)
                curveTo(14.5f, 12.7239f, 14.2761f, 12.5f, 14.0f, 12.5f)
                close()
            }
        }
            .build()
        return _case!!
    }

private var _case: ImageVector? = null
