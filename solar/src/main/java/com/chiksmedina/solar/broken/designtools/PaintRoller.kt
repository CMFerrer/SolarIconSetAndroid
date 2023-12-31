package com.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.DesignToolsGroup

val DesignToolsGroup.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) {
            return _paintRoller!!
        }
        _paintRoller = Builder(
            name = "PaintRoller", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.75f, 6.799f)
                lineTo(6.375f, 7.4486f)
                lineTo(6.75f, 6.799f)
                close()
                moveTo(6.201f, 6.25f)
                lineTo(5.5514f, 6.625f)
                lineTo(6.201f, 6.25f)
                close()
                moveTo(17.799f, 6.25f)
                lineTo(18.4486f, 6.625f)
                lineTo(17.799f, 6.25f)
                close()
                moveTo(17.25f, 6.799f)
                lineTo(17.625f, 7.4486f)
                lineTo(17.25f, 6.799f)
                close()
                moveTo(17.25f, 2.201f)
                lineTo(17.625f, 1.5514f)
                lineTo(17.25f, 2.201f)
                close()
                moveTo(17.799f, 2.75f)
                lineTo(18.4486f, 2.375f)
                lineTo(17.799f, 2.75f)
                close()
                moveTo(6.75f, 2.201f)
                lineTo(6.375f, 1.5514f)
                lineTo(6.75f, 2.201f)
                close()
                moveTo(6.201f, 2.75f)
                lineTo(5.5514f, 2.375f)
                lineTo(6.201f, 2.75f)
                close()
                moveTo(13.7071f, 21.7071f)
                lineTo(13.1768f, 21.1768f)
                lineTo(13.1768f, 21.1768f)
                lineTo(13.7071f, 21.7071f)
                close()
                moveTo(13.7071f, 14.2929f)
                lineTo(13.1768f, 14.8232f)
                lineTo(13.1768f, 14.8232f)
                lineTo(13.7071f, 14.2929f)
                close()
                moveTo(10.2929f, 14.2929f)
                lineTo(9.7626f, 13.7626f)
                lineTo(9.7626f, 13.7626f)
                lineTo(10.2929f, 14.2929f)
                close()
                moveTo(10.2929f, 21.7071f)
                lineTo(10.8232f, 21.1768f)
                lineTo(10.8232f, 21.1768f)
                lineTo(10.2929f, 21.7071f)
                close()
                moveTo(15.5179f, 11.7307f)
                curveTo(15.9275f, 11.6693f, 16.2098f, 11.2874f, 16.1483f, 10.8777f)
                curveTo(16.0869f, 10.4681f, 15.705f, 10.1859f, 15.2954f, 10.2473f)
                lineTo(15.5179f, 11.7307f)
                close()
                moveTo(19.372f, 9.6358f)
                curveTo(18.9624f, 9.6973f, 18.6801f, 10.0791f, 18.7416f, 10.4888f)
                curveTo(18.803f, 10.8984f, 19.1849f, 11.1807f, 19.5945f, 11.1192f)
                lineTo(19.372f, 9.6358f)
                close()
                moveTo(21.861f, 5.7673f)
                lineTo(22.5588f, 5.4926f)
                lineTo(22.5588f, 5.4926f)
                lineTo(21.861f, 5.7673f)
                close()
                moveTo(20.7327f, 4.639f)
                lineTo(20.4579f, 5.3369f)
                lineTo(20.4579f, 5.3369f)
                lineTo(20.7327f, 4.639f)
                close()
                moveTo(20.9384f, 10.0438f)
                lineTo(20.5865f, 9.3815f)
                lineTo(20.5865f, 9.3815f)
                lineTo(20.9384f, 10.0438f)
                close()
                moveTo(21.8858f, 8.9437f)
                lineTo(22.593f, 9.1935f)
                lineTo(22.593f, 9.1935f)
                lineTo(21.8858f, 8.9437f)
                close()
                moveTo(12.4845f, 11.9173f)
                lineTo(11.9162f, 11.4278f)
                lineTo(11.9162f, 11.4278f)
                lineTo(12.4845f, 11.9173f)
                close()
                moveTo(12.0047f, 14.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(12.7423f)
                lineTo(12.7546f, 14.0125f)
                lineTo(12.0047f, 14.0f)
                close()
                moveTo(5.5f, 3.75f)
                curveTo(5.0858f, 3.75f, 4.75f, 4.0858f, 4.75f, 4.5f)
                curveTo(4.75f, 4.9142f, 5.0858f, 5.25f, 5.5f, 5.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(10.0f, 2.75f)
                curveTo(10.4142f, 2.75f, 10.75f, 2.4142f, 10.75f, 2.0f)
                curveTo(10.75f, 1.5858f, 10.4142f, 1.25f, 10.0f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(14.0f, 1.25f)
                curveTo(13.5858f, 1.25f, 13.25f, 1.5858f, 13.25f, 2.0f)
                curveTo(13.25f, 2.4142f, 13.5858f, 2.75f, 14.0f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(15.5f, 6.25f)
                horizontalLineTo(8.5f)
                verticalLineTo(7.75f)
                horizontalLineTo(15.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(8.5f, 6.25f)
                curveTo(8.0189f, 6.25f, 7.7082f, 6.2493f, 7.4728f, 6.2279f)
                curveTo(7.2476f, 6.2075f, 7.1659f, 6.1731f, 7.125f, 6.1495f)
                lineTo(6.375f, 7.4486f)
                curveTo(6.6822f, 7.6259f, 7.0082f, 7.692f, 7.3373f, 7.7218f)
                curveTo(7.6562f, 7.7507f, 8.0465f, 7.75f, 8.5f, 7.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(5.25f, 4.5f)
                curveTo(5.25f, 4.9535f, 5.2493f, 5.3438f, 5.2782f, 5.6627f)
                curveTo(5.308f, 5.9918f, 5.3741f, 6.3178f, 5.5514f, 6.625f)
                lineTo(6.8505f, 5.875f)
                curveTo(6.8269f, 5.8341f, 6.7925f, 5.7524f, 6.7721f, 5.5272f)
                curveTo(6.7507f, 5.2918f, 6.75f, 4.9811f, 6.75f, 4.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(7.125f, 6.1495f)
                curveTo(7.011f, 6.0837f, 6.9163f, 5.989f, 6.8505f, 5.875f)
                lineTo(5.5514f, 6.625f)
                curveTo(5.7489f, 6.967f, 6.033f, 7.2511f, 6.375f, 7.4486f)
                lineTo(7.125f, 6.1495f)
                close()
                moveTo(17.25f, 4.5f)
                curveTo(17.25f, 4.9811f, 17.2493f, 5.2918f, 17.2279f, 5.5272f)
                curveTo(17.2075f, 5.7524f, 17.1731f, 5.8341f, 17.1495f, 5.875f)
                lineTo(18.4486f, 6.625f)
                curveTo(18.6259f, 6.3178f, 18.692f, 5.9918f, 18.7218f, 5.6627f)
                curveTo(18.7507f, 5.3438f, 18.75f, 4.9535f, 18.75f, 4.5f)
                horizontalLineTo(17.25f)
                close()
                moveTo(15.5f, 7.75f)
                curveTo(15.9535f, 7.75f, 16.3438f, 7.7507f, 16.6626f, 7.7218f)
                curveTo(16.9918f, 7.692f, 17.3178f, 7.6259f, 17.625f, 7.4486f)
                lineTo(16.875f, 6.1495f)
                curveTo(16.8341f, 6.1731f, 16.7524f, 6.2075f, 16.5273f, 6.2279f)
                curveTo(16.2918f, 6.2493f, 15.9811f, 6.25f, 15.5f, 6.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(17.1495f, 5.875f)
                curveTo(17.0837f, 5.989f, 16.989f, 6.0837f, 16.875f, 6.1495f)
                lineTo(17.625f, 7.4486f)
                curveTo(17.967f, 7.2511f, 18.2511f, 6.967f, 18.4486f, 6.625f)
                lineTo(17.1495f, 5.875f)
                close()
                moveTo(15.5f, 2.75f)
                curveTo(15.9811f, 2.75f, 16.2918f, 2.7507f, 16.5273f, 2.7721f)
                curveTo(16.7524f, 2.7925f, 16.8341f, 2.8269f, 16.875f, 2.8505f)
                lineTo(17.625f, 1.5514f)
                curveTo(17.3178f, 1.3741f, 16.9918f, 1.308f, 16.6626f, 1.2782f)
                curveTo(16.3438f, 1.2493f, 15.9535f, 1.25f, 15.5f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(18.75f, 4.5f)
                curveTo(18.75f, 4.0465f, 18.7507f, 3.6562f, 18.7218f, 3.3373f)
                curveTo(18.692f, 3.0082f, 18.6259f, 2.6822f, 18.4486f, 2.375f)
                lineTo(17.1495f, 3.125f)
                curveTo(17.1731f, 3.1659f, 17.2075f, 3.2476f, 17.2279f, 3.4727f)
                curveTo(17.2493f, 3.7082f, 17.25f, 4.0189f, 17.25f, 4.5f)
                horizontalLineTo(18.75f)
                close()
                moveTo(16.875f, 2.8505f)
                curveTo(16.989f, 2.9163f, 17.0837f, 3.011f, 17.1495f, 3.125f)
                lineTo(18.4486f, 2.375f)
                curveTo(18.2511f, 2.033f, 17.967f, 1.7489f, 17.625f, 1.5514f)
                lineTo(16.875f, 2.8505f)
                close()
                moveTo(8.5f, 1.25f)
                curveTo(8.0465f, 1.25f, 7.6562f, 1.2493f, 7.3373f, 1.2782f)
                curveTo(7.0082f, 1.308f, 6.6822f, 1.3741f, 6.375f, 1.5514f)
                lineTo(7.125f, 2.8505f)
                curveTo(7.1659f, 2.8269f, 7.2476f, 2.7925f, 7.4728f, 2.7721f)
                curveTo(7.7082f, 2.7507f, 8.0189f, 2.75f, 8.5f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(6.75f, 4.5f)
                curveTo(6.75f, 4.0189f, 6.7507f, 3.7082f, 6.7721f, 3.4727f)
                curveTo(6.7925f, 3.2476f, 6.8269f, 3.1659f, 6.8505f, 3.125f)
                lineTo(5.5514f, 2.375f)
                curveTo(5.3741f, 2.6822f, 5.308f, 3.0082f, 5.2782f, 3.3373f)
                curveTo(5.2493f, 3.6562f, 5.25f, 4.0465f, 5.25f, 4.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6.375f, 1.5514f)
                curveTo(6.033f, 1.7489f, 5.7489f, 2.033f, 5.5514f, 2.375f)
                lineTo(6.8505f, 3.125f)
                curveTo(6.9163f, 3.011f, 7.011f, 2.9163f, 7.125f, 2.8505f)
                lineTo(6.375f, 1.5514f)
                close()
                moveTo(10.75f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.75f)
                close()
                moveTo(13.25f, 16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.25f)
                close()
                moveTo(13.25f, 20.0f)
                curveTo(13.25f, 20.4926f, 13.2484f, 20.7866f, 13.2201f, 20.9973f)
                curveTo(13.2071f, 21.0939f, 13.1918f, 21.1423f, 13.1828f, 21.164f)
                curveTo(13.1808f, 21.1691f, 13.1791f, 21.1724f, 13.1781f, 21.1743f)
                curveTo(13.1771f, 21.1762f, 13.1766f, 21.1771f, 13.1765f, 21.1772f)
                curveTo(13.1765f, 21.1772f, 13.1766f, 21.177f, 13.1769f, 21.1766f)
                curveTo(13.1772f, 21.1763f, 13.1772f, 21.1763f, 13.1768f, 21.1768f)
                lineTo(14.2374f, 22.2374f)
                curveTo(14.5465f, 21.9284f, 14.6589f, 21.5527f, 14.7067f, 21.1972f)
                curveTo(14.7516f, 20.8633f, 14.75f, 20.4502f, 14.75f, 20.0f)
                horizontalLineTo(13.25f)
                close()
                moveTo(12.0f, 22.75f)
                curveTo(12.4502f, 22.75f, 12.8633f, 22.7516f, 13.1972f, 22.7067f)
                curveTo(13.5527f, 22.6589f, 13.9284f, 22.5465f, 14.2374f, 22.2374f)
                lineTo(13.1768f, 21.1768f)
                curveTo(13.1763f, 21.1772f, 13.1763f, 21.1772f, 13.1767f, 21.1769f)
                curveTo(13.177f, 21.1766f, 13.1772f, 21.1765f, 13.1772f, 21.1765f)
                curveTo(13.1771f, 21.1766f, 13.1762f, 21.1771f, 13.1743f, 21.1781f)
                curveTo(13.1724f, 21.1791f, 13.1691f, 21.1808f, 13.164f, 21.1828f)
                curveTo(13.1423f, 21.1918f, 13.0939f, 21.2071f, 12.9973f, 21.2201f)
                curveTo(12.7866f, 21.2484f, 12.4926f, 21.25f, 12.0f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(12.0f, 14.75f)
                curveTo(12.4926f, 14.75f, 12.7866f, 14.7516f, 12.9973f, 14.7799f)
                curveTo(13.0939f, 14.7929f, 13.1423f, 14.8082f, 13.164f, 14.8172f)
                curveTo(13.1691f, 14.8192f, 13.1724f, 14.8209f, 13.1743f, 14.8219f)
                curveTo(13.1762f, 14.8229f, 13.1771f, 14.8234f, 13.1772f, 14.8235f)
                curveTo(13.1772f, 14.8235f, 13.177f, 14.8234f, 13.1766f, 14.8231f)
                curveTo(13.1763f, 14.8228f, 13.1763f, 14.8228f, 13.1768f, 14.8232f)
                lineTo(14.2374f, 13.7626f)
                curveTo(13.9284f, 13.4535f, 13.5527f, 13.3411f, 13.1972f, 13.2933f)
                curveTo(12.8633f, 13.2484f, 12.4502f, 13.25f, 12.0f, 13.25f)
                verticalLineTo(14.75f)
                close()
                moveTo(14.75f, 16.0f)
                curveTo(14.75f, 15.5498f, 14.7516f, 15.1367f, 14.7067f, 14.8028f)
                curveTo(14.6589f, 14.4473f, 14.5465f, 14.0716f, 14.2374f, 13.7626f)
                lineTo(13.1768f, 14.8232f)
                curveTo(13.1772f, 14.8237f, 13.1772f, 14.8237f, 13.1769f, 14.8234f)
                curveTo(13.1766f, 14.823f, 13.1765f, 14.8228f, 13.1765f, 14.8228f)
                curveTo(13.1766f, 14.8229f, 13.1771f, 14.8238f, 13.1781f, 14.8257f)
                curveTo(13.1791f, 14.8276f, 13.1808f, 14.8309f, 13.1828f, 14.836f)
                curveTo(13.1918f, 14.8577f, 13.2071f, 14.9061f, 13.2201f, 15.0027f)
                curveTo(13.2484f, 15.2134f, 13.25f, 15.5074f, 13.25f, 16.0f)
                horizontalLineTo(14.75f)
                close()
                moveTo(10.75f, 16.0f)
                curveTo(10.75f, 15.5074f, 10.7516f, 15.2134f, 10.7799f, 15.0027f)
                curveTo(10.7929f, 14.9061f, 10.8082f, 14.8577f, 10.8172f, 14.836f)
                curveTo(10.8192f, 14.8309f, 10.8209f, 14.8276f, 10.8219f, 14.8257f)
                curveTo(10.8229f, 14.8238f, 10.8234f, 14.8229f, 10.8235f, 14.8228f)
                curveTo(10.8235f, 14.8228f, 10.8234f, 14.823f, 10.8231f, 14.8234f)
                curveTo(10.8228f, 14.8237f, 10.8228f, 14.8237f, 10.8232f, 14.8232f)
                lineTo(9.7626f, 13.7626f)
                curveTo(9.4535f, 14.0716f, 9.3411f, 14.4473f, 9.2933f, 14.8028f)
                curveTo(9.2484f, 15.1367f, 9.25f, 15.5498f, 9.25f, 16.0f)
                horizontalLineTo(10.75f)
                close()
                moveTo(12.0f, 13.25f)
                curveTo(11.5498f, 13.25f, 11.1367f, 13.2484f, 10.8028f, 13.2933f)
                curveTo(10.4473f, 13.3411f, 10.0716f, 13.4535f, 9.7626f, 13.7626f)
                lineTo(10.8232f, 14.8232f)
                curveTo(10.8237f, 14.8228f, 10.8237f, 14.8228f, 10.8234f, 14.8231f)
                curveTo(10.823f, 14.8234f, 10.8228f, 14.8235f, 10.8228f, 14.8235f)
                curveTo(10.8229f, 14.8234f, 10.8238f, 14.8229f, 10.8257f, 14.8219f)
                curveTo(10.8276f, 14.8209f, 10.8309f, 14.8192f, 10.836f, 14.8172f)
                curveTo(10.8577f, 14.8082f, 10.9061f, 14.7929f, 11.0027f, 14.7799f)
                curveTo(11.2134f, 14.7516f, 11.5074f, 14.75f, 12.0f, 14.75f)
                verticalLineTo(13.25f)
                close()
                moveTo(9.25f, 20.0f)
                curveTo(9.25f, 20.4502f, 9.2484f, 20.8633f, 9.2933f, 21.1972f)
                curveTo(9.3411f, 21.5527f, 9.4535f, 21.9284f, 9.7626f, 22.2374f)
                lineTo(10.8232f, 21.1768f)
                curveTo(10.8228f, 21.1763f, 10.8228f, 21.1763f, 10.8231f, 21.1766f)
                curveTo(10.8234f, 21.177f, 10.8235f, 21.1772f, 10.8235f, 21.1772f)
                curveTo(10.8234f, 21.1771f, 10.8229f, 21.1762f, 10.8219f, 21.1743f)
                curveTo(10.8209f, 21.1724f, 10.8192f, 21.1691f, 10.8172f, 21.164f)
                curveTo(10.8082f, 21.1423f, 10.7929f, 21.0939f, 10.7799f, 20.9973f)
                curveTo(10.7516f, 20.7866f, 10.75f, 20.4926f, 10.75f, 20.0f)
                horizontalLineTo(9.25f)
                close()
                moveTo(12.0f, 21.25f)
                curveTo(11.5074f, 21.25f, 11.2134f, 21.2484f, 11.0027f, 21.2201f)
                curveTo(10.9061f, 21.2071f, 10.8577f, 21.1918f, 10.836f, 21.1828f)
                curveTo(10.8309f, 21.1808f, 10.8276f, 21.1791f, 10.8257f, 21.1781f)
                curveTo(10.8238f, 21.1771f, 10.8229f, 21.1766f, 10.8228f, 21.1765f)
                curveTo(10.8228f, 21.1765f, 10.823f, 21.1766f, 10.8234f, 21.1769f)
                curveTo(10.8237f, 21.1772f, 10.8237f, 21.1772f, 10.8232f, 21.1768f)
                lineTo(9.7626f, 22.2374f)
                curveTo(10.0716f, 22.5465f, 10.4473f, 22.6589f, 10.8028f, 22.7067f)
                curveTo(11.1367f, 22.7516f, 11.5498f, 22.75f, 12.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(19.0449f, 3.75f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.25f)
                horizontalLineTo(19.0449f)
                verticalLineTo(3.75f)
                close()
                moveTo(22.75f, 7.4551f)
                curveTo(22.75f, 7.02f, 22.7504f, 6.6578f, 22.731f, 6.3612f)
                curveTo(22.7113f, 6.0582f, 22.6687f, 5.7717f, 22.5588f, 5.4926f)
                lineTo(21.1631f, 6.0421f)
                curveTo(21.1922f, 6.1161f, 21.2192f, 6.2286f, 21.2342f, 6.4588f)
                curveTo(21.2496f, 6.6953f, 21.25f, 7.0004f, 21.25f, 7.4551f)
                horizontalLineTo(22.75f)
                close()
                moveTo(19.0449f, 5.25f)
                curveTo(19.4996f, 5.25f, 19.8047f, 5.2504f, 20.0412f, 5.2658f)
                curveTo(20.2714f, 5.2808f, 20.3839f, 5.3078f, 20.4579f, 5.3369f)
                lineTo(21.0074f, 3.9412f)
                curveTo(20.7283f, 3.8313f, 20.4418f, 3.7887f, 20.1388f, 3.769f)
                curveTo(19.8422f, 3.7496f, 19.48f, 3.75f, 19.0449f, 3.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(22.5588f, 5.4926f)
                curveTo(22.2793f, 4.7826f, 21.7174f, 4.2207f, 21.0074f, 3.9412f)
                lineTo(20.4579f, 5.3369f)
                curveTo(20.7806f, 5.464f, 21.0361f, 5.7194f, 21.1631f, 6.0421f)
                lineTo(22.5588f, 5.4926f)
                close()
                moveTo(19.5945f, 11.1192f)
                curveTo(20.303f, 11.0129f, 20.846f, 10.9422f, 21.2904f, 10.7061f)
                lineTo(20.5865f, 9.3815f)
                curveTo(20.4254f, 9.4671f, 20.2001f, 9.5116f, 19.372f, 9.6358f)
                lineTo(19.5945f, 11.1192f)
                close()
                moveTo(21.25f, 7.4551f)
                curveTo(21.25f, 8.2924f, 21.2394f, 8.5218f, 21.1786f, 8.6939f)
                lineTo(22.593f, 9.1935f)
                curveTo(22.7606f, 8.719f, 22.75f, 8.1716f, 22.75f, 7.4551f)
                horizontalLineTo(21.25f)
                close()
                moveTo(21.2904f, 10.7061f)
                curveTo(21.8987f, 10.3829f, 22.3636f, 9.843f, 22.593f, 9.1935f)
                lineTo(21.1786f, 8.6939f)
                curveTo(21.0744f, 8.9892f, 20.8631f, 9.2346f, 20.5865f, 9.3815f)
                lineTo(21.2904f, 10.7061f)
                close()
                moveTo(15.2954f, 10.2473f)
                curveTo(14.5021f, 10.3663f, 13.8376f, 10.4646f, 13.3149f, 10.6116f)
                curveTo(12.7718f, 10.7643f, 12.2913f, 10.9923f, 11.9162f, 11.4278f)
                lineTo(13.0528f, 12.4067f)
                curveTo(13.1623f, 12.2796f, 13.3303f, 12.1654f, 13.7209f, 12.0556f)
                curveTo(14.1318f, 11.94f, 14.6861f, 11.8555f, 15.5179f, 11.7307f)
                lineTo(15.2954f, 10.2473f)
                close()
                moveTo(12.7546f, 14.0125f)
                curveTo(12.7724f, 12.9469f, 12.8713f, 12.6175f, 13.0528f, 12.4067f)
                lineTo(11.9162f, 11.4278f)
                curveTo(11.3354f, 12.1023f, 11.2717f, 12.9787f, 11.2548f, 13.9875f)
                lineTo(12.7546f, 14.0125f)
                close()
                moveTo(12.0f, 14.75f)
                horizontalLineTo(12.0047f)
                verticalLineTo(13.25f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.75f)
                close()
                moveTo(6.0f, 3.75f)
                horizontalLineTo(5.5f)
                verticalLineTo(5.25f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.75f)
                close()
                moveTo(8.5f, 2.75f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.25f)
                horizontalLineTo(8.5f)
                verticalLineTo(2.75f)
                close()
                moveTo(14.0f, 2.75f)
                horizontalLineTo(15.5f)
                verticalLineTo(1.25f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.75f)
                close()
            }
        }
            .build()
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
