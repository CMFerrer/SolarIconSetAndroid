package com.chiksmedina.solar.outline.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NotesGroup

public val NotesGroup.ArchiveCheck: ImageVector
    get() {
        if (_archiveCheck != null) {
            return _archiveCheck!!
        }
        _archiveCheck = Builder(name = "ArchiveCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.9553f, 2.25f)
                curveTo(3.9701f, 2.25f, 3.985f, 2.25f, 4.0f, 2.25f)
                lineTo(20.0448f, 2.25f)
                curveTo(20.4776f, 2.2499f, 20.8744f, 2.2499f, 21.1972f, 2.2933f)
                curveTo(21.5527f, 2.3411f, 21.9284f, 2.4536f, 22.2374f, 2.7626f)
                curveTo(22.5465f, 3.0716f, 22.6589f, 3.4473f, 22.7067f, 3.8028f)
                curveTo(22.7501f, 4.1256f, 22.7501f, 4.5224f, 22.75f, 4.9553f)
                verticalLineTo(5.0448f)
                curveTo(22.7501f, 5.4776f, 22.7501f, 5.8744f, 22.7067f, 6.1972f)
                curveTo(22.6589f, 6.5527f, 22.5465f, 6.9284f, 22.2374f, 7.2374f)
                curveTo(21.9437f, 7.5312f, 21.5896f, 7.6473f, 21.25f, 7.6991f)
                verticalLineTo(13.0564f)
                curveTo(21.25f, 14.8942f, 21.25f, 16.3498f, 21.0969f, 17.489f)
                curveTo(20.9392f, 18.6615f, 20.6071f, 19.6104f, 19.8588f, 20.3588f)
                curveTo(19.1104f, 21.1071f, 18.1615f, 21.4392f, 16.989f, 21.5969f)
                curveTo(15.8498f, 21.75f, 14.3942f, 21.75f, 12.5564f, 21.75f)
                horizontalLineTo(11.4436f)
                curveTo(9.6058f, 21.75f, 8.1502f, 21.75f, 7.011f, 21.5969f)
                curveTo(5.8386f, 21.4392f, 4.8896f, 21.1071f, 4.1413f, 20.3588f)
                curveTo(3.3929f, 19.6104f, 3.0608f, 18.6615f, 2.9031f, 17.489f)
                curveTo(2.75f, 16.3498f, 2.75f, 14.8942f, 2.75f, 13.0564f)
                lineTo(2.75f, 7.6991f)
                curveTo(2.4104f, 7.6473f, 2.0563f, 7.5312f, 1.7626f, 7.2374f)
                curveTo(1.4535f, 6.9284f, 1.3411f, 6.5527f, 1.2933f, 6.1972f)
                curveTo(1.2499f, 5.8744f, 1.25f, 5.4776f, 1.25f, 5.0448f)
                curveTo(1.25f, 5.0299f, 1.25f, 5.015f, 1.25f, 5.0f)
                curveTo(1.25f, 4.9851f, 1.25f, 4.9701f, 1.25f, 4.9553f)
                curveTo(1.25f, 4.5224f, 1.2499f, 4.1256f, 1.2933f, 3.8028f)
                curveTo(1.3411f, 3.4473f, 1.4535f, 3.0716f, 1.7626f, 2.7626f)
                curveTo(2.0716f, 2.4536f, 2.4473f, 2.3411f, 2.8028f, 2.2933f)
                curveTo(3.1256f, 2.2499f, 3.5224f, 2.2499f, 3.9553f, 2.25f)
                close()
                moveTo(4.25f, 7.75f)
                verticalLineTo(13.0f)
                curveTo(4.25f, 14.9068f, 4.2516f, 16.2615f, 4.3898f, 17.2892f)
                curveTo(4.525f, 18.2952f, 4.7787f, 18.8749f, 5.2019f, 19.2981f)
                curveTo(5.6251f, 19.7213f, 6.2048f, 19.975f, 7.2109f, 20.1102f)
                curveTo(8.2385f, 20.2484f, 9.5932f, 20.25f, 11.5f, 20.25f)
                horizontalLineTo(12.5f)
                curveTo(14.4068f, 20.25f, 15.7615f, 20.2484f, 16.7892f, 20.1102f)
                curveTo(17.7952f, 19.975f, 18.3749f, 19.7213f, 18.7981f, 19.2981f)
                curveTo(19.2213f, 18.8749f, 19.475f, 18.2952f, 19.6102f, 17.2892f)
                curveTo(19.7484f, 16.2615f, 19.75f, 14.9068f, 19.75f, 13.0f)
                verticalLineTo(7.75f)
                horizontalLineTo(4.25f)
                close()
                moveTo(2.8232f, 3.8232f)
                lineTo(2.8257f, 3.8219f)
                curveTo(2.8276f, 3.8209f, 2.8309f, 3.8192f, 2.836f, 3.8172f)
                curveTo(2.8577f, 3.8082f, 2.9061f, 3.7929f, 3.0027f, 3.7799f)
                curveTo(3.2134f, 3.7516f, 3.5074f, 3.75f, 4.0f, 3.75f)
                horizontalLineTo(20.0f)
                curveTo(20.4926f, 3.75f, 20.7866f, 3.7516f, 20.9973f, 3.7799f)
                curveTo(21.0939f, 3.7929f, 21.1423f, 3.8082f, 21.164f, 3.8172f)
                curveTo(21.1691f, 3.8192f, 21.1724f, 3.8209f, 21.1743f, 3.8219f)
                lineTo(21.1768f, 3.8232f)
                lineTo(21.1781f, 3.8257f)
                curveTo(21.1792f, 3.8276f, 21.1808f, 3.8309f, 21.1828f, 3.836f)
                curveTo(21.1918f, 3.8577f, 21.2071f, 3.9061f, 21.2201f, 4.0027f)
                curveTo(21.2484f, 4.2134f, 21.25f, 4.5074f, 21.25f, 5.0f)
                curveTo(21.25f, 5.4926f, 21.2484f, 5.7866f, 21.2201f, 5.9973f)
                curveTo(21.2071f, 6.0939f, 21.1918f, 6.1423f, 21.1828f, 6.164f)
                curveTo(21.1808f, 6.1691f, 21.1792f, 6.1724f, 21.1781f, 6.1743f)
                lineTo(21.1768f, 6.1768f)
                lineTo(21.1743f, 6.1782f)
                curveTo(21.1724f, 6.1792f, 21.1691f, 6.1808f, 21.164f, 6.1828f)
                curveTo(21.1423f, 6.1918f, 21.0939f, 6.2071f, 20.9973f, 6.2201f)
                curveTo(20.7866f, 6.2484f, 20.4926f, 6.25f, 20.0f, 6.25f)
                horizontalLineTo(4.0f)
                curveTo(3.5074f, 6.25f, 3.2134f, 6.2484f, 3.0027f, 6.2201f)
                curveTo(2.9061f, 6.2071f, 2.8577f, 6.1918f, 2.836f, 6.1828f)
                curveTo(2.8309f, 6.1808f, 2.8276f, 6.1792f, 2.8257f, 6.1782f)
                lineTo(2.8232f, 6.1768f)
                lineTo(2.8219f, 6.1743f)
                curveTo(2.8209f, 6.1724f, 2.8192f, 6.1691f, 2.8172f, 6.164f)
                curveTo(2.8082f, 6.1423f, 2.7929f, 6.0939f, 2.7799f, 5.9973f)
                curveTo(2.7516f, 5.7866f, 2.75f, 5.4926f, 2.75f, 5.0f)
                curveTo(2.75f, 4.5074f, 2.7516f, 4.2134f, 2.7799f, 4.0027f)
                curveTo(2.7929f, 3.9061f, 2.8082f, 3.8577f, 2.8172f, 3.836f)
                curveTo(2.8192f, 3.8309f, 2.8209f, 3.8276f, 2.8219f, 3.8257f)
                lineTo(2.8232f, 3.8232f)
                close()
                moveTo(2.8232f, 6.1768f)
                curveTo(2.823f, 6.1764f, 2.8228f, 6.1764f, 2.8232f, 6.1768f)
                close()
                moveTo(14.9995f, 10.4406f)
                curveTo(15.3085f, 10.7164f, 15.3353f, 11.1905f, 15.0595f, 11.4995f)
                lineTo(11.488f, 15.4995f)
                curveTo(11.3457f, 15.6589f, 11.1422f, 15.75f, 10.9286f, 15.75f)
                curveTo(10.7149f, 15.75f, 10.5114f, 15.6589f, 10.3691f, 15.4995f)
                lineTo(8.9405f, 13.8995f)
                curveTo(8.6647f, 13.5905f, 8.6915f, 13.1164f, 9.0005f, 12.8406f)
                curveTo(9.3095f, 12.5647f, 9.7836f, 12.5915f, 10.0595f, 12.9005f)
                lineTo(10.9286f, 13.8739f)
                lineTo(13.9406f, 10.5005f)
                curveTo(14.2164f, 10.1915f, 14.6905f, 10.1647f, 14.9995f, 10.4406f)
                close()
            }
        }
        .build()
        return _archiveCheck!!
    }

private var _archiveCheck: ImageVector? = null
