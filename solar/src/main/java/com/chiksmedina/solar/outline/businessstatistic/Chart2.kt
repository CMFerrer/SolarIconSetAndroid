package com.chiksmedina.solar.outline.businessstatistic

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
import com.chiksmedina.solar.outline.BusinessStatisticGroup

val BusinessStatisticGroup.Chart2: ImageVector
    get() {
        if (_chart2 != null) {
            return _chart2!!
        }
        _chart2 = Builder(
            name = "Chart2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.9553f, 1.25f)
                curveTo(18.5224f, 1.25f, 18.1256f, 1.2499f, 17.8028f, 1.2933f)
                curveTo(17.4473f, 1.3411f, 17.0716f, 1.4535f, 16.7626f, 1.7626f)
                curveTo(16.4535f, 2.0716f, 16.3411f, 2.4473f, 16.2933f, 2.8028f)
                curveTo(16.2499f, 3.1256f, 16.25f, 3.5224f, 16.25f, 3.9553f)
                verticalLineTo(17.0448f)
                curveTo(16.25f, 17.4776f, 16.2499f, 17.8744f, 16.2933f, 18.1972f)
                curveTo(16.3411f, 18.5527f, 16.4535f, 18.9284f, 16.7626f, 19.2374f)
                curveTo(17.0716f, 19.5465f, 17.4473f, 19.6589f, 17.8028f, 19.7067f)
                curveTo(18.1256f, 19.7501f, 18.5224f, 19.7501f, 18.9553f, 19.75f)
                horizontalLineTo(19.0448f)
                curveTo(19.4776f, 19.7501f, 19.8744f, 19.7501f, 20.1972f, 19.7067f)
                curveTo(20.5527f, 19.6589f, 20.9284f, 19.5465f, 21.2374f, 19.2374f)
                curveTo(21.5465f, 18.9284f, 21.6589f, 18.5527f, 21.7067f, 18.1972f)
                curveTo(21.7501f, 17.8744f, 21.7501f, 17.4776f, 21.75f, 17.0448f)
                verticalLineTo(3.9553f)
                curveTo(21.7501f, 3.5224f, 21.7501f, 3.1256f, 21.7067f, 2.8028f)
                curveTo(21.6589f, 2.4473f, 21.5465f, 2.0716f, 21.2374f, 1.7626f)
                curveTo(20.9284f, 1.4535f, 20.5527f, 1.3411f, 20.1972f, 1.2933f)
                curveTo(19.8744f, 1.2499f, 19.4776f, 1.25f, 19.0448f, 1.25f)
                horizontalLineTo(18.9553f)
                close()
                moveTo(17.8257f, 2.8219f)
                lineTo(17.8232f, 2.8232f)
                lineTo(17.8219f, 2.8257f)
                curveTo(17.8209f, 2.8276f, 17.8192f, 2.8309f, 17.8172f, 2.836f)
                curveTo(17.8082f, 2.8577f, 17.7929f, 2.9061f, 17.7799f, 3.0027f)
                curveTo(17.7516f, 3.2134f, 17.75f, 3.5074f, 17.75f, 4.0f)
                verticalLineTo(17.0f)
                curveTo(17.75f, 17.4926f, 17.7516f, 17.7866f, 17.7799f, 17.9973f)
                curveTo(17.7929f, 18.0939f, 17.8082f, 18.1423f, 17.8172f, 18.164f)
                curveTo(17.8192f, 18.1691f, 17.8209f, 18.1724f, 17.8219f, 18.1743f)
                lineTo(17.8232f, 18.1768f)
                lineTo(17.8257f, 18.1781f)
                curveTo(17.8265f, 18.1786f, 17.8276f, 18.1791f, 17.8289f, 18.1797f)
                curveTo(17.8307f, 18.1806f, 17.8331f, 18.1817f, 17.836f, 18.1828f)
                curveTo(17.8578f, 18.1918f, 17.9061f, 18.2071f, 18.0027f, 18.2201f)
                curveTo(18.2134f, 18.2484f, 18.5074f, 18.25f, 19.0f, 18.25f)
                curveTo(19.4926f, 18.25f, 19.7866f, 18.2484f, 19.9973f, 18.2201f)
                curveTo(20.0939f, 18.2071f, 20.1423f, 18.1918f, 20.164f, 18.1828f)
                curveTo(20.1691f, 18.1808f, 20.1724f, 18.1792f, 20.1743f, 18.1781f)
                lineTo(20.1768f, 18.1768f)
                lineTo(20.1781f, 18.1743f)
                curveTo(20.1792f, 18.1724f, 20.1808f, 18.1691f, 20.1828f, 18.164f)
                curveTo(20.1918f, 18.1423f, 20.2071f, 18.0939f, 20.2201f, 17.9973f)
                curveTo(20.2484f, 17.7866f, 20.25f, 17.4926f, 20.25f, 17.0f)
                verticalLineTo(4.0f)
                curveTo(20.25f, 3.5074f, 20.2484f, 3.2134f, 20.2201f, 3.0027f)
                curveTo(20.2071f, 2.9061f, 20.1918f, 2.8577f, 20.1828f, 2.836f)
                curveTo(20.1808f, 2.8309f, 20.1792f, 2.8276f, 20.1781f, 2.8257f)
                lineTo(20.1768f, 2.8232f)
                lineTo(20.1743f, 2.8219f)
                curveTo(20.1724f, 2.8209f, 20.1691f, 2.8192f, 20.164f, 2.8172f)
                curveTo(20.1423f, 2.8082f, 20.0939f, 2.7929f, 19.9973f, 2.7799f)
                curveTo(19.7866f, 2.7516f, 19.4926f, 2.75f, 19.0f, 2.75f)
                curveTo(18.5074f, 2.75f, 18.2134f, 2.7516f, 18.0027f, 2.7799f)
                curveTo(17.9061f, 2.7929f, 17.8578f, 2.8082f, 17.836f, 2.8172f)
                curveTo(17.8309f, 2.8192f, 17.8276f, 2.8209f, 17.8257f, 2.8219f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9553f, 4.25f)
                horizontalLineTo(12.0448f)
                curveTo(12.4776f, 4.2499f, 12.8744f, 4.2499f, 13.1972f, 4.2933f)
                curveTo(13.5527f, 4.3411f, 13.9284f, 4.4535f, 14.2374f, 4.7626f)
                curveTo(14.5465f, 5.0716f, 14.6589f, 5.4473f, 14.7067f, 5.8028f)
                curveTo(14.7501f, 6.1256f, 14.7501f, 6.5224f, 14.75f, 6.9552f)
                verticalLineTo(17.0448f)
                curveTo(14.7501f, 17.4776f, 14.7501f, 17.8744f, 14.7067f, 18.1972f)
                curveTo(14.6589f, 18.5527f, 14.5465f, 18.9284f, 14.2374f, 19.2374f)
                curveTo(13.9284f, 19.5465f, 13.5527f, 19.6589f, 13.1972f, 19.7067f)
                curveTo(12.8744f, 19.7501f, 12.4776f, 19.7501f, 12.0448f, 19.75f)
                horizontalLineTo(11.9553f)
                curveTo(11.5225f, 19.7501f, 11.1256f, 19.7501f, 10.8028f, 19.7067f)
                curveTo(10.4473f, 19.6589f, 10.0716f, 19.5465f, 9.7626f, 19.2374f)
                curveTo(9.4536f, 18.9284f, 9.3411f, 18.5527f, 9.2933f, 18.1972f)
                curveTo(9.2499f, 17.8744f, 9.25f, 17.4776f, 9.25f, 17.0448f)
                verticalLineTo(6.9553f)
                curveTo(9.25f, 6.5224f, 9.2499f, 6.1256f, 9.2933f, 5.8028f)
                curveTo(9.3411f, 5.4473f, 9.4536f, 5.0716f, 9.7626f, 4.7626f)
                curveTo(10.0716f, 4.4535f, 10.4473f, 4.3411f, 10.8028f, 4.2933f)
                curveTo(11.1256f, 4.2499f, 11.5224f, 4.2499f, 11.9553f, 4.25f)
                close()
                moveTo(10.8232f, 5.8232f)
                lineTo(10.8257f, 5.8219f)
                lineTo(10.8234f, 18.1768f)
                lineTo(10.8219f, 18.1743f)
                curveTo(10.8209f, 18.1724f, 10.8192f, 18.1691f, 10.8172f, 18.164f)
                curveTo(10.8082f, 18.1423f, 10.7929f, 18.0939f, 10.7799f, 17.9973f)
                curveTo(10.7516f, 17.7866f, 10.75f, 17.4926f, 10.75f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(10.75f, 6.5074f, 10.7516f, 6.2134f, 10.7799f, 6.0027f)
                curveTo(10.7929f, 5.9061f, 10.8082f, 5.8577f, 10.8172f, 5.836f)
                curveTo(10.8192f, 5.8309f, 10.8209f, 5.8276f, 10.8219f, 5.8257f)
                lineTo(10.8232f, 5.8232f)
                close()
                moveTo(10.8234f, 18.1768f)
                lineTo(10.8257f, 5.8219f)
                lineTo(10.8295f, 5.82f)
                lineTo(10.836f, 5.8172f)
                curveTo(10.8578f, 5.8082f, 10.9061f, 5.7929f, 11.0027f, 5.7799f)
                curveTo(11.2134f, 5.7516f, 11.5074f, 5.75f, 12.0f, 5.75f)
                curveTo(12.4926f, 5.75f, 12.7866f, 5.7516f, 12.9973f, 5.7799f)
                curveTo(13.0939f, 5.7929f, 13.1423f, 5.8082f, 13.164f, 5.8172f)
                curveTo(13.1691f, 5.8192f, 13.1724f, 5.8209f, 13.1743f, 5.8219f)
                lineTo(13.1768f, 5.8232f)
                lineTo(13.1781f, 5.8257f)
                curveTo(13.1792f, 5.8276f, 13.1808f, 5.8309f, 13.1828f, 5.836f)
                curveTo(13.1918f, 5.8577f, 13.2071f, 5.9061f, 13.2201f, 6.0027f)
                curveTo(13.2484f, 6.2134f, 13.25f, 6.5074f, 13.25f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(13.25f, 17.4926f, 13.2484f, 17.7866f, 13.2201f, 17.9973f)
                curveTo(13.2071f, 18.0939f, 13.1918f, 18.1423f, 13.1828f, 18.164f)
                curveTo(13.1808f, 18.1691f, 13.1792f, 18.1724f, 13.1781f, 18.1743f)
                lineTo(13.1768f, 18.1768f)
                lineTo(13.1743f, 18.1781f)
                curveTo(13.1731f, 18.1788f, 13.1712f, 18.1797f, 13.1686f, 18.1809f)
                curveTo(13.1673f, 18.1815f, 13.1658f, 18.1821f, 13.164f, 18.1828f)
                curveTo(13.1423f, 18.1918f, 13.0939f, 18.2071f, 12.9973f, 18.2201f)
                curveTo(12.7866f, 18.2484f, 12.4926f, 18.25f, 12.0f, 18.25f)
                curveTo(11.5074f, 18.25f, 11.2134f, 18.2484f, 11.0027f, 18.2201f)
                curveTo(10.9061f, 18.2071f, 10.8578f, 18.1918f, 10.836f, 18.1828f)
                curveTo(10.8309f, 18.1808f, 10.8276f, 18.1792f, 10.8257f, 18.1781f)
                lineTo(10.8234f, 18.1768f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.9553f, 8.25f)
                curveTo(4.5224f, 8.25f, 4.1256f, 8.2499f, 3.8028f, 8.2933f)
                curveTo(3.4473f, 8.3411f, 3.0716f, 8.4536f, 2.7626f, 8.7626f)
                curveTo(2.4536f, 9.0716f, 2.3411f, 9.4473f, 2.2933f, 9.8028f)
                curveTo(2.2499f, 10.1256f, 2.2499f, 10.5224f, 2.25f, 10.9553f)
                verticalLineTo(17.0448f)
                curveTo(2.2499f, 17.4776f, 2.2499f, 17.8744f, 2.2933f, 18.1972f)
                curveTo(2.3411f, 18.5527f, 2.4536f, 18.9284f, 2.7626f, 19.2374f)
                curveTo(3.0716f, 19.5465f, 3.4473f, 19.6589f, 3.8028f, 19.7067f)
                curveTo(4.1256f, 19.7501f, 4.5224f, 19.7501f, 4.9553f, 19.75f)
                horizontalLineTo(5.0448f)
                curveTo(5.4776f, 19.7501f, 5.8744f, 19.7501f, 6.1972f, 19.7067f)
                curveTo(6.5527f, 19.6589f, 6.9284f, 19.5465f, 7.2374f, 19.2374f)
                curveTo(7.5465f, 18.9284f, 7.6589f, 18.5527f, 7.7067f, 18.1972f)
                curveTo(7.7501f, 17.8744f, 7.7501f, 17.4776f, 7.75f, 17.0448f)
                verticalLineTo(10.9553f)
                curveTo(7.7501f, 10.5224f, 7.7501f, 10.1256f, 7.7067f, 9.8028f)
                curveTo(7.6589f, 9.4473f, 7.5465f, 9.0716f, 7.2374f, 8.7626f)
                curveTo(6.9284f, 8.4536f, 6.5527f, 8.3411f, 6.1972f, 8.2933f)
                curveTo(5.8744f, 8.2499f, 5.4776f, 8.25f, 5.0448f, 8.25f)
                horizontalLineTo(4.9553f)
                close()
                moveTo(3.8257f, 9.8219f)
                lineTo(3.8232f, 9.8232f)
                lineTo(3.8219f, 9.8257f)
                curveTo(3.8209f, 9.8276f, 3.8192f, 9.8309f, 3.8172f, 9.836f)
                curveTo(3.8082f, 9.8577f, 3.7929f, 9.9061f, 3.7799f, 10.0027f)
                curveTo(3.7516f, 10.2134f, 3.75f, 10.5074f, 3.75f, 11.0f)
                verticalLineTo(17.0f)
                curveTo(3.75f, 17.4926f, 3.7516f, 17.7866f, 3.7799f, 17.9973f)
                curveTo(3.7929f, 18.0939f, 3.8082f, 18.1423f, 3.8172f, 18.164f)
                curveTo(3.8192f, 18.1691f, 3.8209f, 18.1724f, 3.8219f, 18.1743f)
                lineTo(3.8228f, 18.1761f)
                lineTo(3.8257f, 18.1781f)
                curveTo(3.8276f, 18.1792f, 3.8309f, 18.1808f, 3.836f, 18.1828f)
                curveTo(3.8577f, 18.1918f, 3.9061f, 18.2071f, 4.0027f, 18.2201f)
                curveTo(4.2134f, 18.2484f, 4.5074f, 18.25f, 5.0f, 18.25f)
                curveTo(5.4926f, 18.25f, 5.7866f, 18.2484f, 5.9973f, 18.2201f)
                curveTo(6.0939f, 18.2071f, 6.1423f, 18.1918f, 6.164f, 18.1828f)
                curveTo(6.1691f, 18.1808f, 6.1724f, 18.1792f, 6.1743f, 18.1781f)
                lineTo(6.1768f, 18.1768f)
                lineTo(6.1782f, 18.1743f)
                lineTo(6.1804f, 18.1698f)
                lineTo(6.1828f, 18.164f)
                curveTo(6.1918f, 18.1423f, 6.2071f, 18.0939f, 6.2201f, 17.9973f)
                curveTo(6.2484f, 17.7866f, 6.25f, 17.4926f, 6.25f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(6.25f, 10.5074f, 6.2484f, 10.2134f, 6.2201f, 10.0027f)
                curveTo(6.2071f, 9.9061f, 6.1918f, 9.8577f, 6.1828f, 9.836f)
                curveTo(6.1808f, 9.8309f, 6.1792f, 9.8276f, 6.1782f, 9.8257f)
                lineTo(6.1768f, 9.8232f)
                lineTo(6.1743f, 9.8219f)
                curveTo(6.1724f, 9.8209f, 6.1691f, 9.8192f, 6.164f, 9.8172f)
                curveTo(6.1423f, 9.8082f, 6.0939f, 9.7929f, 5.9973f, 9.7799f)
                curveTo(5.7866f, 9.7516f, 5.4926f, 9.75f, 5.0f, 9.75f)
                curveTo(4.5074f, 9.75f, 4.2134f, 9.7516f, 4.0027f, 9.7799f)
                curveTo(3.9061f, 9.7929f, 3.8577f, 9.8082f, 3.836f, 9.8172f)
                curveTo(3.8309f, 9.8192f, 3.8276f, 9.8209f, 3.8257f, 9.8219f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 21.25f)
                curveTo(2.5858f, 21.25f, 2.25f, 21.5858f, 2.25f, 22.0f)
                curveTo(2.25f, 22.4142f, 2.5858f, 22.75f, 3.0f, 22.75f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 22.75f, 21.75f, 22.4142f, 21.75f, 22.0f)
                curveTo(21.75f, 21.5858f, 21.4142f, 21.25f, 21.0f, 21.25f)
                horizontalLineTo(3.0f)
                close()
            }
        }
            .build()
        return _chart2!!
    }

private var _chart2: ImageVector? = null
