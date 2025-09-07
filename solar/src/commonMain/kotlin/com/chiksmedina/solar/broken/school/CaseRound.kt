package com.chiksmedina.solar.broken.school

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
import com.chiksmedina.solar.broken.SchoolGroup

val SchoolGroup.CaseRound: ImageVector
    get() {
        if (_caseRound != null) {
            return _caseRound!!
        }
        _caseRound = Builder(
            name = "CaseRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.1709f, 4.0f)
                curveTo(9.5827f, 2.8348f, 10.694f, 2.0f, 12.0002f, 2.0f)
                curveTo(13.3064f, 2.0f, 14.4177f, 2.8348f, 14.8295f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.25f)
                curveTo(11.5858f, 22.25f, 11.25f, 22.5858f, 11.25f, 23.0f)
                curveTo(11.25f, 23.4142f, 11.5858f, 23.75f, 12.0f, 23.75f)
                verticalLineTo(22.25f)
                close()
                moveTo(4.318f, 21.8284f)
                lineTo(4.8163f, 21.2679f)
                lineTo(4.318f, 21.8284f)
                close()
                moveTo(19.682f, 21.8284f)
                lineTo(19.1837f, 21.2679f)
                lineTo(19.1837f, 21.2679f)
                lineTo(19.682f, 21.8284f)
                close()
                moveTo(7.9548f, 23.6837f)
                curveTo(8.3682f, 23.7087f, 8.7236f, 23.3938f, 8.7486f, 22.9804f)
                curveTo(8.7736f, 22.5669f, 8.4587f, 22.2115f, 8.0452f, 22.1865f)
                lineTo(7.9548f, 23.6837f)
                close()
                moveTo(2.25f, 13.0f)
                curveTo(2.25f, 14.8741f, 2.2492f, 16.8307f, 2.4188f, 18.4664f)
                curveTo(2.5037f, 19.2856f, 2.634f, 20.0548f, 2.8407f, 20.7105f)
                curveTo(3.0441f, 21.3557f, 3.3444f, 21.9665f, 3.8198f, 22.389f)
                lineTo(4.8163f, 21.2679f)
                curveTo(4.6326f, 21.1046f, 4.4387f, 20.7904f, 4.2713f, 20.2596f)
                curveTo(4.1074f, 19.7394f, 3.9906f, 19.0818f, 3.9107f, 18.3118f)
                curveTo(3.7508f, 16.769f, 3.75f, 14.8971f, 3.75f, 13.0f)
                horizontalLineTo(2.25f)
                close()
                moveTo(12.0f, 23.75f)
                curveTo(14.1024f, 23.75f, 15.7464f, 23.7513f, 17.0267f, 23.5983f)
                curveTo(18.3204f, 23.4436f, 19.3568f, 23.1209f, 20.1803f, 22.389f)
                lineTo(19.1837f, 21.2679f)
                curveTo(18.6891f, 21.7075f, 18.0058f, 21.9706f, 16.8487f, 22.1089f)
                curveTo(15.6782f, 22.2487f, 14.1402f, 22.25f, 12.0f, 22.25f)
                verticalLineTo(23.75f)
                close()
                moveTo(8.0452f, 22.1865f)
                curveTo(6.331f, 22.0829f, 5.4315f, 21.8147f, 4.8163f, 21.2679f)
                lineTo(3.8198f, 22.389f)
                curveTo(4.8358f, 23.2921f, 6.1827f, 23.5767f, 7.9548f, 23.6837f)
                lineTo(8.0452f, 22.1865f)
                close()
                moveTo(20.2499f, 13.3873f)
                curveTo(20.2492f, 15.2185f, 20.2371f, 17.0032f, 20.0724f, 18.4673f)
                curveTo(19.9902f, 19.1982f, 19.8728f, 19.8201f, 19.7119f, 20.3117f)
                curveTo(19.548f, 20.8126f, 19.3605f, 21.1108f, 19.1837f, 21.2679f)
                lineTo(20.1803f, 22.389f)
                curveTo(20.6399f, 21.9804f, 20.9352f, 21.3963f, 21.1375f, 20.7783f)
                curveTo(21.3428f, 20.1509f, 21.4751f, 19.4171f, 21.563f, 18.635f)
                curveTo(21.7387f, 17.0731f, 21.7492f, 15.2032f, 21.7499f, 13.3879f)
                lineTo(20.2499f, 13.3873f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.6603f, 15.0f)
                lineTo(17.664f, 14.2166f)
                moveTo(9.3397f, 15.0f)
                lineTo(3.3324f, 13.4332f)
                curveTo(2.7369f, 13.2779f, 2.4392f, 13.2002f, 2.2502f, 13.0141f)
                curveTo(2.2134f, 12.9778f, 2.1802f, 12.939f, 2.1508f, 12.8979f)
                curveTo(2.0f, 12.6871f, 2.0f, 12.4168f, 2.0f, 11.8763f)
                curveTo(2.0f, 9.7462f, 2.0f, 8.6811f, 2.673f, 7.9621f)
                curveTo(2.8023f, 7.8239f, 2.9476f, 7.6975f, 3.1066f, 7.5851f)
                curveTo(3.9337f, 7.0f, 5.1588f, 7.0f, 7.6089f, 7.0f)
                horizontalLineTo(16.3911f)
                curveTo(18.8412f, 7.0f, 20.0663f, 7.0f, 20.8934f, 7.5851f)
                curveTo(21.0524f, 7.6975f, 21.1977f, 7.8239f, 21.327f, 7.9621f)
                curveTo(22.0f, 8.6811f, 22.0f, 9.7462f, 22.0f, 11.8763f)
                curveTo(22.0f, 12.4168f, 22.0f, 12.6871f, 21.8492f, 12.8979f)
                curveTo(21.8199f, 12.939f, 21.7866f, 12.9778f, 21.7498f, 13.0141f)
                curveTo(21.5999f, 13.1618f, 21.3814f, 13.2412f, 21.0f, 13.3453f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 13.5f)
                horizontalLineTo(10.0f)
                curveTo(9.7239f, 13.5f, 9.5f, 13.7239f, 9.5f, 14.0f)
                verticalLineTo(16.1615f)
                curveTo(9.5f, 16.3659f, 9.6245f, 16.5498f, 9.8143f, 16.6257f)
                lineTo(10.5144f, 16.9058f)
                curveTo(11.4681f, 17.2872f, 12.5319f, 17.2872f, 13.4856f, 16.9058f)
                lineTo(14.1857f, 16.6257f)
                curveTo(14.3755f, 16.5498f, 14.5f, 16.3659f, 14.5f, 16.1615f)
                verticalLineTo(14.0f)
                curveTo(14.5f, 13.7239f, 14.2761f, 13.5f, 14.0f, 13.5f)
                close()
            }
        }
            .build()
        return _caseRound!!
    }

private var _caseRound: ImageVector? = null
