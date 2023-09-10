package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SchoolGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.7754f, 5.25f)
                horizontalLineTo(17.2246f)
                curveTo(18.0409f, 5.25f, 18.6994f, 5.25f, 19.2325f, 5.2937f)
                curveTo(19.7814f, 5.3388f, 20.2635f, 5.4339f, 20.7092f, 5.6621f)
                curveTo(21.4095f, 6.0207f, 21.9793f, 6.5905f, 22.3379f, 7.2908f)
                curveTo(22.5661f, 7.7365f, 22.6612f, 8.2186f, 22.7063f, 8.7675f)
                curveTo(22.75f, 9.3007f, 22.75f, 9.9591f, 22.75f, 10.7754f)
                verticalLineTo(10.8077f)
                curveTo(22.75f, 10.8363f, 22.7501f, 10.8651f, 22.7502f, 10.894f)
                curveTo(22.7511f, 11.2321f, 22.7522f, 11.5921f, 22.6216f, 11.9139f)
                curveTo(22.5095f, 12.1902f, 22.3286f, 12.4333f, 22.0961f, 12.6201f)
                curveTo(21.9901f, 12.7054f, 21.8726f, 12.7729f, 21.7495f, 12.8293f)
                curveTo(21.7466f, 14.4416f, 21.7259f, 16.0708f, 21.5813f, 17.4664f)
                curveTo(21.4963f, 18.2856f, 21.366f, 19.0548f, 21.1593f, 19.7105f)
                curveTo(20.9559f, 20.3557f, 20.6556f, 20.9665f, 20.1803f, 21.389f)
                curveTo(19.3568f, 22.1209f, 18.3204f, 22.4436f, 17.0267f, 22.5983f)
                curveTo(15.7568f, 22.75f, 14.1291f, 22.75f, 12.0512f, 22.75f)
                horizontalLineTo(11.9488f)
                curveTo(9.8709f, 22.75f, 8.2432f, 22.75f, 6.9733f, 22.5983f)
                curveTo(5.6796f, 22.4436f, 4.6432f, 22.1209f, 3.8198f, 21.389f)
                curveTo(3.3444f, 20.9665f, 3.0441f, 20.3557f, 2.8407f, 19.7105f)
                curveTo(2.634f, 19.0548f, 2.5037f, 18.2856f, 2.4188f, 17.4664f)
                curveTo(2.2741f, 16.0708f, 2.2534f, 14.4416f, 2.2505f, 12.8293f)
                curveTo(2.1274f, 12.7729f, 2.0099f, 12.7054f, 1.9038f, 12.6201f)
                curveTo(1.6714f, 12.4333f, 1.4905f, 12.1902f, 1.3784f, 11.9139f)
                curveTo(1.2478f, 11.5921f, 1.2489f, 11.2321f, 1.2498f, 10.894f)
                curveTo(1.2499f, 10.8651f, 1.25f, 10.8363f, 1.25f, 10.8077f)
                lineTo(1.25f, 10.7754f)
                curveTo(1.25f, 9.9591f, 1.25f, 9.3006f, 1.2937f, 8.7675f)
                curveTo(1.3388f, 8.2186f, 1.4339f, 7.7365f, 1.6621f, 7.2908f)
                curveTo(2.0207f, 6.5905f, 2.5905f, 6.0207f, 3.2908f, 5.6621f)
                curveTo(3.7366f, 5.4339f, 4.2186f, 5.3388f, 4.7675f, 5.2937f)
                curveTo(5.3007f, 5.25f, 5.9591f, 5.25f, 6.7754f, 5.25f)
                close()
                moveTo(3.7521f, 13.3087f)
                curveTo(3.7589f, 14.7455f, 3.7878f, 16.1259f, 3.9108f, 17.3118f)
                curveTo(3.9906f, 18.0818f, 4.1074f, 18.7394f, 4.2713f, 19.2596f)
                curveTo(4.4387f, 19.7904f, 4.6326f, 20.1046f, 4.8163f, 20.2679f)
                curveTo(5.3109f, 20.7075f, 5.9942f, 20.9706f, 7.1513f, 21.1089f)
                curveTo(8.3218f, 21.2487f, 9.8598f, 21.25f, 12.0f, 21.25f)
                curveTo(14.1402f, 21.25f, 15.6782f, 21.2487f, 16.8487f, 21.1089f)
                curveTo(18.0058f, 20.9706f, 18.6891f, 20.7075f, 19.1837f, 20.2679f)
                curveTo(19.3674f, 20.1046f, 19.5613f, 19.7904f, 19.7287f, 19.2596f)
                curveTo(19.8926f, 18.7394f, 20.0094f, 18.0818f, 20.0892f, 17.3118f)
                curveTo(20.2122f, 16.1259f, 20.2411f, 14.7455f, 20.2479f, 13.3087f)
                lineTo(15.25f, 14.808f)
                verticalLineTo(15.1615f)
                curveTo(15.25f, 15.6726f, 14.9388f, 16.1322f, 14.4642f, 16.3221f)
                lineTo(13.7641f, 16.6021f)
                curveTo(12.6317f, 17.0551f, 11.3683f, 17.0551f, 10.2359f, 16.6021f)
                lineTo(9.5358f, 16.3221f)
                curveTo(9.0612f, 16.1323f, 8.75f, 15.6726f, 8.75f, 15.1615f)
                verticalLineTo(14.808f)
                lineTo(3.7521f, 13.3087f)
                close()
                moveTo(8.75f, 13.242f)
                lineTo(3.3576f, 11.6242f)
                curveTo(3.1421f, 11.5596f, 3.0177f, 11.5218f, 2.9264f, 11.4873f)
                curveTo(2.8705f, 11.4661f, 2.8482f, 11.4536f, 2.8424f, 11.45f)
                curveTo(2.81f, 11.4237f, 2.7847f, 11.3897f, 2.7688f, 11.3512f)
                curveTo(2.7671f, 11.3446f, 2.7615f, 11.3197f, 2.7573f, 11.26f)
                curveTo(2.7504f, 11.1627f, 2.75f, 11.0326f, 2.75f, 10.8077f)
                curveTo(2.75f, 9.9515f, 2.7506f, 9.3547f, 2.7887f, 8.8902f)
                curveTo(2.8261f, 8.4345f, 2.8958f, 8.1727f, 2.9973f, 7.9745f)
                curveTo(3.2125f, 7.5543f, 3.5543f, 7.2125f, 3.9745f, 6.9973f)
                curveTo(4.1727f, 6.8958f, 4.4345f, 6.8261f, 4.8902f, 6.7887f)
                curveTo(5.3547f, 6.7506f, 5.9515f, 6.75f, 6.8077f, 6.75f)
                horizontalLineTo(17.1923f)
                curveTo(18.0485f, 6.75f, 18.6453f, 6.7506f, 19.1098f, 6.7887f)
                curveTo(19.5655f, 6.8261f, 19.8273f, 6.8958f, 20.0255f, 6.9973f)
                curveTo(20.4457f, 7.2125f, 20.7876f, 7.5543f, 21.0027f, 7.9745f)
                curveTo(21.1042f, 8.1727f, 21.1739f, 8.4345f, 21.2113f, 8.8902f)
                curveTo(21.2494f, 9.3547f, 21.25f, 9.9515f, 21.25f, 10.8077f)
                curveTo(21.25f, 11.0326f, 21.2496f, 11.1627f, 21.2427f, 11.26f)
                curveTo(21.2385f, 11.3197f, 21.233f, 11.3446f, 21.2312f, 11.3512f)
                curveTo(21.2153f, 11.3897f, 21.19f, 11.4237f, 21.1576f, 11.45f)
                curveTo(21.1518f, 11.4536f, 21.1296f, 11.4661f, 21.0736f, 11.4873f)
                curveTo(20.9823f, 11.5218f, 20.8578f, 11.5596f, 20.6424f, 11.6242f)
                lineTo(15.25f, 13.242f)
                verticalLineTo(13.0f)
                curveTo(15.25f, 12.3096f, 14.6904f, 11.75f, 14.0f, 11.75f)
                horizontalLineTo(10.0f)
                curveTo(9.3097f, 11.75f, 8.75f, 12.3096f, 8.75f, 13.0f)
                verticalLineTo(13.242f)
                close()
                moveTo(21.1593f, 11.4489f)
                lineTo(21.1576f, 11.45f)
                close()
                moveTo(21.2306f, 11.3531f)
                lineTo(21.2312f, 11.3512f)
                close()
                moveTo(2.7694f, 11.3531f)
                lineTo(2.7688f, 11.3512f)
                close()
                moveTo(2.8407f, 11.4489f)
                lineTo(2.8424f, 11.45f)
                close()
                moveTo(10.25f, 13.25f)
                verticalLineTo(14.9922f)
                lineTo(10.793f, 15.2094f)
                curveTo(11.5678f, 15.5194f, 12.4322f, 15.5194f, 13.207f, 15.2094f)
                lineTo(13.75f, 14.9922f)
                verticalLineTo(13.25f)
                horizontalLineTo(10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0002f, 2.75f)
                curveTo(11.0217f, 2.75f, 10.1873f, 3.375f, 9.878f, 4.2499f)
                curveTo(9.74f, 4.6405f, 9.3115f, 4.8452f, 8.921f, 4.7071f)
                curveTo(8.5304f, 4.5691f, 8.3257f, 4.1406f, 8.4638f, 3.7501f)
                curveTo(8.9782f, 2.2946f, 10.3662f, 1.25f, 12.0002f, 1.25f)
                curveTo(13.6341f, 1.25f, 15.0222f, 2.2946f, 15.5366f, 3.7501f)
                curveTo(15.6747f, 4.1406f, 15.47f, 4.5691f, 15.0794f, 4.7071f)
                curveTo(14.6889f, 4.8452f, 14.2604f, 4.6405f, 14.1224f, 4.2499f)
                curveTo(13.8131f, 3.375f, 12.9787f, 2.75f, 12.0002f, 2.75f)
                close()
            }
        }
            .build()
        return _caseRound!!
    }

private var _caseRound: ImageVector? = null
